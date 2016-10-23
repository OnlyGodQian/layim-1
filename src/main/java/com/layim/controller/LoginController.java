package com.layim.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.layim.po.Mine;
import com.layim.po.User;
import com.layim.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		if(request.getMethod().equals("POST")){
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			User result = userService.selectByUsername(username);
			if(result!=null){
				if(password.equals(result.getPassword())){
					return "redirect:/chat";
				}
			}
		}
		return "redirect:/";
	}
	
	/**
	 * 测试分页
	 */
	@RequestMapping("/test")
	public void test(){
		PageHelper.startPage(1, 10);
		List<Mine> user = userService.selectAllUser();
		PageInfo<Mine> page = new PageInfo<Mine>(user);
		System.out.println(page.toString());
	}
	
	
}
