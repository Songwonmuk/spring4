package net.softsociety.spring4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 메인화면으로 이동
 */
@Controller
public class HomeController {
	
	@GetMapping({"", "/"})
	public String home() {
		return "home";
	}
	
}
