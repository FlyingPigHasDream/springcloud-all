package com.springcloud.all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringcloudAllApplication {

	@ResponseBody
	@GetMapping("/")
	public String name (){
		return "Hello Docker World!";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringcloudAllApplication.class, args);
	}
}
