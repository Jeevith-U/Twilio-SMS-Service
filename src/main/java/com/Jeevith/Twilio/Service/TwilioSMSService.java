package com.Jeevith.Twilio.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Jeevith.Twilio.Configuration.TwilioConfig;
import com.Jeevith.Twilio.Dao.TwilioDao;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.twiml.messaging.Body;
import com.twilio.type.PhoneNumber;

@Service
public class TwilioSMSService {
	
	@Autowired
	private TwilioConfig config;
	
	private String defaultMessage = "Hello, this message is sent from Doctor Varsha. I hope you remember your appointment today." ;
	
	public ResponseEntity<TwilioDao> sendSMSForPaticent(){
		
		Message msg = Message.creator(
				new PhoneNumber("+919902486348"),
				new PhoneNumber(config.getPhoneNumber())
				, defaultMessage).create() ;
		
		TwilioDao dao = new TwilioDao("+919902486348", "Jeevith", this.defaultMessage) ;
		
		return new ResponseEntity<TwilioDao>(dao, HttpStatus.OK) ;
	}
}
