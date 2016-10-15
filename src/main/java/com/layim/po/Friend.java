package com.layim.po;

import java.util.List;

/**
 * 好友列表
 * @author Administrator
 *
 */
public class Friend {
	private String groupname;
	private String id;
	private String online;
	private List<User> list;
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOnline() {
		return online;
	}
	public void setOnline(String online) {
		this.online = online;
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	
}
