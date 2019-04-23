package com.jaszczook.sri3.racelogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class RaceLoggerReceiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(RaceLoggerReceiver.class);

	@JmsListener(destination = "carData.t")
	public void receive(CarData carData) {
		LOGGER.info("received car data = {}", carData);
	}
}
