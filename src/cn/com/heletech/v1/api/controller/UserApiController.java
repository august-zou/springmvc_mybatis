package cn.com.heletech.v1.api.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.xml.internal.ws.api.ha.HaInfo;

import cn.com.heletech.model.ApiResult;
import cn.com.heletech.model.User;
import cn.com.heletech.service.UserService;

@Controller
@RequestMapping(value = "/v1/api")
@ResponseBody
public class UserApiController {
	@Resource
	private UserService userService;

	@RequestMapping("user/index")

	public ApiResult index() {
		
		List<User> users = userService.findAllUsers();
		for (User u : users) {
			System.out.print("userName: " + u.getUserName());
			System.out.print("  password: " + u.getPassword());
		}
		
		ApiResult apiResult = new ApiResult(200,"success",users);

		return apiResult;
	}

	@RequestMapping("user/{id}")
	public ApiResult getUserById() {
		User user = new User();
		user.setUserName("xx");
		user.setPassword("x1x");

		System.out.print("userName: " + user.getUserName());
		System.out.print("  password: " + user.getPassword());

		ApiResult apiResult = new ApiResult(200,"success",user);

		return apiResult;
	}
	
	@RequestMapping(value = "jsonMap", method = RequestMethod.GET)
	public ApiResult getJson1() {
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("userName", "xx");
		map.put("password", "***");
		
		User user = new User();
		user.setUserName("xx");
		user.setPassword("x1x");

		System.out.print("userName: " + user.getUserName());
		System.out.print("  password: " + user.getPassword());
		map.put("user", user);
		
		ApiResult apiResult = new ApiResult(200,"获取成功",map);

		return apiResult;
	}
}
