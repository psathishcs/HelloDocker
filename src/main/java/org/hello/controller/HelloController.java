package org.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/v1")
public class HelloController {
	@RequestMapping("/")
	public String home(){
		return "Hello, World Docker.";
	}
	@RequestMapping(method=RequestMethod.GET, path="/hello")
	public  @ResponseBody  String sayHello() {
		return "Say Hello World!";
	}
}
