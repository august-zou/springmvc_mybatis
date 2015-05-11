package cn.com.heletech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
	
	/**
	 * 用户列表
	 * @return
	 */
	@RequestMapping(value = "/user/index",method = RequestMethod.GET)
    public String index(Model model) {
        return "users/index";
    }

}
