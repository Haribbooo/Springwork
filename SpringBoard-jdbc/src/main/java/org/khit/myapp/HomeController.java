package org.khit.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//�ε��� ������
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
