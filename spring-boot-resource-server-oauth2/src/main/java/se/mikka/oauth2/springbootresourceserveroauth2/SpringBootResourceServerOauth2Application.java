package se.mikka.oauth2.springbootresourceserveroauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class SpringBootResourceServerOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootResourceServerOauth2Application.class, args);
	}
	
}
