package com.layim.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.layim.po.Data;
import com.layim.po.Friend;
import com.layim.po.Group;
import com.layim.po.Init;
import com.layim.po.Mine;
import com.layim.po.User;


@Controller
public class IndexController {
	
	@RequestMapping("/getList")
	public void getList(HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		Data data = new Data();
		Mine mine = new Mine();
		mine.setUsername("我的昵称");
		mine.setId(1000);
		mine.setStatus("online");//在线状态 online：在线、hide：隐身
		mine.setSign("我是个性签名");
		mine.setAvatar("http://avatar.52pojie.cn/data/avatar/000/13/34/66_avatar_middle.jpg");
		data.setMine(mine);
		List<Friend> friendList = new ArrayList<Friend>();
		Friend friend = new Friend();
		friend.setGroupname("后端马吊");
		friend.setId("1");
		friend.setOnline("2");
		List<User> userList = new ArrayList<User>();
		User user = new User();
		user.setAvatar("http://avatar.52pojie.cn/data/avatar/000/13/34/66_avatar_middle.jpg");
		user.setUsername("沈少快");
		user.setId(10001);
		userList.add(user);
		friend.setList(userList);
		friendList.add(friend);
		data.setFriend(friendList);
		List<Group> groupList = new ArrayList<Group>();
		Group group = new Group();
		group.setAvatar("http://avatar.52pojie.cn/data/avatar/000/13/34/66_avatar_middle.jpg");
		group.setGroupname("分组名称");
		group.setId("101");
		groupList.add(group);
		data.setGroup(groupList);
		Init init = new Init();
		init.setCode(0);
		init.setMsg("成功");
		init.setData(data);
		Object object = JSONObject.toJSON(init);
		try {
			response.getWriter().println(object);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
