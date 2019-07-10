package com.imti.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.sb.bean.User;
import com.imti.sb.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello(){
		return "hello yang gang abcd!";
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("id",100);
		model.addAttribute("name","admin");
		model.addAttribute("password", "123");
		return "index";
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public String save() {
		User user = new User();
		user.setId(100);
		user.setName("admin");
		user.setPassword("123");
		userService.save(user);
		return "save success !";
	}

}
