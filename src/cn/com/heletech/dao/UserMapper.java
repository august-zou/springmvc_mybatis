package cn.com.heletech.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.heletech.model.User;

public interface UserMapper {
	public User findUserByName(@Param("userName") String userName);
	public List<User> findAllUsers();

}
