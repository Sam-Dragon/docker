package learn.docker.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {
	private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@GetMapping
	public String hello() {
		logger.info("Welcome to Docker world");

		return "Welcome to Docker world";
	}
}
