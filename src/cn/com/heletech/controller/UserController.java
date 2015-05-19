package cn.com.heletech.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.heletech.model.User;
import cn.com.heletech.service.UserService;


@Controller
public class UserController extends ApplicationController {
	
	@Resource
	private UserService userService;
	
	/**
	 * 用户列表
	 * @return
	 */
	@RequestMapping(value = "/user/index",method = RequestMethod.GET)
    public String index(Model model) {
		List<User> users = userService.findAllUsers();
		for(User u : users){
			System.out.print("userName: "+u.getUserName());
			System.out.print("  password: "+u.getPassword());
		}
        return "users/index";
    }
	
	/**
	 * new
	 * @return
	 */
	@RequestMapping(value = "/register",method = RequestMethod.GET)
    public String newRequest() {
        return "users/new";
    }
	
	/**
	 * create
	 * @return
	 */
	@RequestMapping(value = "users/create",method = RequestMethod.POST)
    public String create(User user) {
		System.out.print(user.getUserName());

        return "redirect:/";
    }
	
	
	

}
