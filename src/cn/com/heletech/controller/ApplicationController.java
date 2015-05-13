package cn.com.heletech.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

public class ApplicationController {
	@Autowired
	protected  HttpServletRequest request;
}
