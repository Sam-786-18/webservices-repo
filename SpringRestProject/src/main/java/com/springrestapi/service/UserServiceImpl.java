package com.springrestapi.service;

import org.springframework.stereotype.Service;

import com.springrestapi.domain.User;
import com.springrestapi.util.JsonUtil;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String searchUser(Integer userId) {
		String jsonUser="";
		if(userId!=null&& userId.equals(101)) {
			User user=new User();
			user.setUserId(userId);
			user.setuName("radhesyam");
			user.setEmail("radhe@gmail.com");
			jsonUser=JsonUtil.javaToJson(user);
		}
		return jsonUser;
	}

}
