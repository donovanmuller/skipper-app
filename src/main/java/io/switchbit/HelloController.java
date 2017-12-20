package io.switchbit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	private TestConfigurationProperties properties;

	public HelloController(TestConfigurationProperties properties) {
		this.properties = properties;
	}

	@GetMapping("/")
	public String greet(Model model) {
		model.addAttribute("greeting", this.properties.getGreeting());

		return "index";
	}
}
