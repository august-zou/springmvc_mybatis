package cn.com.heletech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController extends ApplicationController{
	private final Logger log = LoggerFactory.getLogger(HomeController.class);

	/**
	 * index
	 * @return
	 */
	@RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(Model model) {
		log.info("home controller exe");
        return "index";
    }
	
	
	

}
