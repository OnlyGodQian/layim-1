package com.layim.po;

import java.util.List;

public class Data {
	private Mine mine;
	private List<Friend> friend;
	private List<Group> group;
	public Mine getMine() {
		return mine;
	}
	public void setMine(Mine mine) {
		this.mine = mine;
	}
	public List<Friend> getFriend() {
		return friend;
	}
	public void setFriend(List<Friend> friend) {
		this.friend = friend;
	}
	public List<Group> getGroup() {
		return group;
	}
	public void setGroup(List<Group> group) {
		this.group = group;
	}
	
}
