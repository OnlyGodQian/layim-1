package com.layim.mapping;

import java.util.List;

import com.layim.po.Mine;

public interface MineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mine record);

    int insertSelective(Mine record);

    Mine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mine record);

    int updateByPrimaryKey(Mine record);

	Mine selectByUsername(String username);
	
	List<Mine> selectAllUser();
}