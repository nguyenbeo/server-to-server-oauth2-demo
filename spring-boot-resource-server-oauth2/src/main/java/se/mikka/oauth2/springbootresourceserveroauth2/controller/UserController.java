package se.mikka.oauth2.springbootresourceserveroauth2.controller;

import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping(name = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@PreAuthorize("#oauth2.hasScope('get_user')")
	public User getAuthorizedUser() {
		User user = User.builder().withName("Nguyen Binh Nguyen").withCompany("MiKKa Consuting")
				.withPosition("Co-Founder").withUrl("http://mikka.se")
				.withBio("A senior software engineer").build();
		
		return user;
	}
	
}
