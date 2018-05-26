package se.mikka.oauth2.springbootclientoauth2;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootClientOauth2Application implements CommandLineRunner {
	
	private final Logger LOGGER = LoggerFactory.getLogger(SpringBootClientOauth2Application.class);

    @Value("#{ @environment['example.baseUrl'] }")
    private String serverBaseUrl;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootClientOauth2Application.class, args);
	}
	
	@Bean
    @ConfigurationProperties("example.oauth2.client")
    protected ClientCredentialsResourceDetails oAuthDetails() {
        return new ClientCredentialsResourceDetails();
    }
	
	@Bean
    protected RestTemplate restTemplate() throws KeyManagementException, NoSuchAlgorithmException {
		OAuth2RestTemplate oauthRestTemplate = new OAuth2RestTemplate(oAuthDetails());
        
        return oauthRestTemplate;
    }
	
	@Override
    public void run(String... args) throws RestClientException, KeyManagementException, NoSuchAlgorithmException {
		LOGGER.info("Authorized User: {}", restTemplate().getForObject(serverBaseUrl + "/user", User.class));
    }
	
}
