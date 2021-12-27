package uk.co.lnwatson.challenges.log4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Log4jApplication {

	public static void main(String[] args) {

		SpringApplication.run(Log4jApplication.class, args);

	}

	@RestController
	@RequestMapping("/")
	public class HomeController {


		@GetMapping
		public String defaultMap() {
			return "Ahh";
		}


	}


}
