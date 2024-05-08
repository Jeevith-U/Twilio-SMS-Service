package com.Jeevith.Twilio.Dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TwilioDao {
	
	private String phoneNumber ;
	private String userName ;
	private String twilioMessage ;
}
