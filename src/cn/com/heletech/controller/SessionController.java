package cn.com.heletech.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.com.heletech.model.User;

@Controller
public class SessionController extends ApplicationController {
	

	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login() {
	  return "sessions/login";
	}
	
	@RequestMapping(value="/sessions/create",method = RequestMethod.POST)
	public String create(User user) {
		System.out.print(user.getUserName());
		request.getSession().setAttribute("userName", user.getUserName());  
		return "redirect:/";
	}
	
	@RequestMapping(value="/sessions/destroy",method = RequestMethod.GET)
	public String destroy(User user) {
		request.getSession().setAttribute("userName", null);  
		return "redirect:/";
	}
}
