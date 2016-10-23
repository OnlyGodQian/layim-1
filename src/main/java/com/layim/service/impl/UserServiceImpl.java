package com.layim.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.layim.mapping.MineMapper;
import com.layim.po.Mine;
import com.layim.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private MineMapper minaMapper;

	@Override
	public int deleteUserById(Integer id) {
		return minaMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insertUser(Mine mine) {
		return minaMapper.insertSelective(mine);
	}

	@Override
	public Mine selectUserById(Integer id) {
		return minaMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateUserByid(Mine mine) {
		return minaMapper.updateByPrimaryKeySelective(mine);
	}

	@Override
	public Mine selectByUsername(String username) {
		return minaMapper.selectByUsername(username);
	}

	@Override
	public List<Mine> selectAllUser() {
		return minaMapper.selectAllUser();
	}

}
