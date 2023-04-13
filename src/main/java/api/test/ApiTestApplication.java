package api.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "api.test" })
public class ApiTestApplication {

	public static final String PATH_ENTIDADES = "api.test";

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "true");
		SpringApplication.run(ApiTestApplication.class, args);
	}

}