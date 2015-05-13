package cn.com.heletech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.heletech.model.User;


@Controller
public class UserController extends ApplicationController {
	
	/**
	 * 用户列表
	 * @return
	 */
	@RequestMapping(value = "/user/index",method = RequestMethod.GET)
    public String index(Model model) {
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
