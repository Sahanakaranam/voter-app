package com.xworkz.vote.utility;

import org.apache.log4j.Logger;

public class MailSender {
static Logger logger;

static {
	logger=logger.getLogger(MailSender.class);
	//logger=logger.getLogger("MailSender");
}
public static void main(String[]args) {
	logger.debug("welcome to common moudules");
}
}
