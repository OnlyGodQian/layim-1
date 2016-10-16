package com.layim.service;

import com.layim.po.Mine;
import com.layim.po.User;

public interface UserService {
	public int deleteUserById(Integer id);
	
	public int insertUser(Mine mine);
	
	public Mine selectUserById(Integer id);
	
	public Mine selectByUsername(String username);
	
	public int updateUserByid(Mine mine);
}
