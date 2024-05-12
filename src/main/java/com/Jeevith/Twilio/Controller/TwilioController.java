package com.Jeevith.Twilio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jeevith.Twilio.Dao.TwilioDao;
import com.Jeevith.Twilio.Service.TwilioSMSService;
import com.twilio.Twilio;

@RestController
public class TwilioController {
	
	@Autowired
	private TwilioSMSService twilioSMSService ;
	
	@PostMapping("sms")
	@Scheduled(cron = " 0 0 * * * * ")
	public ResponseEntity<TwilioDao> sendSms(){
		return twilioSMSService.sendSMSForPaticent() ;
	}
}
