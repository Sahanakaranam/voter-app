package com.xworkz.vote.utility;
import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class JavaMailSender {
	public static void main(String[] args) {
		JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
		mailSenderImpl.setHost("smtp.gmail.com");
		mailSenderImpl.setPort(587);
		mailSenderImpl.setUsername("sahanak.xworkz@gmail.com");
		mailSenderImpl.setPassword("");
		
		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "true");
		javaMailProperties.put("mail.smtp.ssl.trust", "*");
		
		mailSenderImpl.setJavaMailProperties(javaMailProperties);
		
		String []bccs = {"sani.sahana98@gmail.com","sahanakcse.rymec@gmail.com"};
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("sahanak.xworkz@gmail.com");
		message.setTo("hloworld08@gmail.com");
		message.setBcc(bccs);
		message.setSubject("Demo Mail Sender");
		message.setText("Hello Everyone, \n I am Sahana.Karanam \n demo mail for sender \n From Xworkz \n");
		
		mailSenderImpl.send(message);
	}

}
