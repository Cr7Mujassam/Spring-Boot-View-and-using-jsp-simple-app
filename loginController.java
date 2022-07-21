package com.in28minutes.springboot.web.springbootfirstwebapplication.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// </login =>> "Welcome to login Page"

//It spring boot will pick the class to send request or get request
@Controller
public class loginController {
	
	//when we write this annotation it will map with url like[ https:8089/login/ ]
	@RequestMapping("/login")
	//@ResponseBody // this will load the return data
	public String login(){
		return "hello";
	}
	
	/*@RequestMapping("/login/even")
	@ResponseBody
	public int even() {
		return 0;
	}
	*/

}
