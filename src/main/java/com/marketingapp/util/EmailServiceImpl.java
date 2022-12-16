package com.marketingapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
 import org.springframework.stereotype.Component;
@Component
public class EmailServiceImpl implements EmailService {
	@Autowired
	private JavaMailSender sendMail;

	@Override
	public void sendEmail(String to, String subject, String message) {
		SimpleMailMessage mailMessage=new SimpleMailMessage();
	try {
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);
		mailMessage.setText(message);
		sendMail.send(mailMessage);
	
	} catch (Exception e) {
		e.printStackTrace();
	}	
	}

}
