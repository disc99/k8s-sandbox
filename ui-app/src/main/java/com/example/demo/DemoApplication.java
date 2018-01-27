package com.example.demo;

import lombok.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@Controller
class Shop {
	@GetMapping("/")
	String top(Model model, HttpServletRequest request) {
		model.addAttribute("req", new Request(request));
		return "index";
	}
}

@Value
class Request {
	HttpServletRequest request;
	public String uri() {
		return request.getRequestURI();
	}
	public String host() {
		return request.getRemoteHost();
	}
}