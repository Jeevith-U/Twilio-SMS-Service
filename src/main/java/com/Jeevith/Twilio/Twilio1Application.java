package com.Jeevith.Twilio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Jeevith.Twilio.Configuration.TwilioConfig;
import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Twilio1Application {
	
	@Autowired
	private TwilioConfig config ;
	
	@PostConstruct
	public void initTwilio() {
		
		Twilio.init(config.getAccountSid(), config.getAuthToken());

	}

	public static void main(String[] args) {
		SpringApplication.run(Twilio1Application.class, args);
	}

}
