package com.layim.controller;

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
	
	@RequestMapping("/chat")
	public String chat(){
		return "WEB-INF/chat.jsp";
	}
	
	@RequestMapping("/getList")
	public void getList(HttpServletResponse response) throws Exception{
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		Data data = new Data();
		//设置我的信息
		Mine mine = new Mine();
		mine.setUsername("我的昵称");
		mine.setId(1000);
		mine.setStatus("online");//在线状态 online：在线、hide：隐身
		mine.setSign("我是个性签名");
		mine.setAvatar("http://avatar.52pojie.cn/data/avatar/000/13/34/66_avatar_middle.jpg");
		data.setMine(mine);
		//设置好友信息
		List<Friend> friendList = new ArrayList<Friend>();
		Friend friend = new Friend();
		friend.setGroupname("后端马吊");//好友分组名字
		friend.setId("1");//分组ID
		friend.setOnline("2");//在线数量，可以不传
		List<User> userList = new ArrayList<User>();//分组下的好友列表
		User user = new User();
		user.setAvatar("http://avatar.52pojie.cn/data/avatar/000/13/34/66_avatar_middle.jpg");
		user.setUsername("沈少快");
		user.setId(10001);
		userList.add(user);
		friend.setList(userList);
		friendList.add(friend);
		data.setFriend(friendList);
		//设置分组信息
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
		
		response.getWriter().println(object);
	}
	
}
