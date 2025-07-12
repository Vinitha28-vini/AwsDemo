package com.example.AwsExample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pathcontroller {

	@GetMapping("/")
		public String home() {
			return "pages/index";
		}
	

}
