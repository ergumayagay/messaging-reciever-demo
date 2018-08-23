package com.emil.messaging.reciever;

import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

@Component
public class Reciever {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(Reciever.class);
	
	@JmsListener(destination = "message-demo", containerFactory="myFactory")
	public void recieveMessage(String message) {
		logger.info("Message: {}",message);
	}

}
