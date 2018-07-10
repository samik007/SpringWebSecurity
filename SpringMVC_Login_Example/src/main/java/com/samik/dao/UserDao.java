package com.samik.dao;

import java.util.List;

import com.samik.model.UserInfo;

public interface UserDao {
	public UserInfo findUserInfo(String username);
	public List<String> getUserRoles(String username);
	
	
}
