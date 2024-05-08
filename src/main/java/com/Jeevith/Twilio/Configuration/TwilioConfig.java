package com.Jeevith.Twilio.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Configuration
@ConfigurationProperties(prefix = "twilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TwilioConfig {
	
	private String accountSid ;
	private String authToken ;
	private String phoneNumber ;
}
