package wecare.care;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class CareApplication {

	public static void main(String[] args) {
		SpringApplication.run(CareApplication.class, args);
	}

	@Configuration
	public class CorsConfig implements WebMvcConfigurer {

	}
}