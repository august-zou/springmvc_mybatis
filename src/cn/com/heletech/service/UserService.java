package cn.com.heletech.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.heletech.dao.UserMapper;
import cn.com.heletech.model.User;


@Service
public class UserService {

	@Resource
	private UserMapper userMapper;
	
	/**
	 * @param 
	 * @return
	 */
	public List<User> findAllUsers() {
		return userMapper.findAllUsers();
	}
	
	/**
	 * @param username
	 * @return
	 */
	public User findUserByName(String username) {
		return userMapper.findUserByName(username);
	}
}
