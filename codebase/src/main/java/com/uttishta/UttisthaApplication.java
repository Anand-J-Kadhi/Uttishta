package com.uttishta;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class is the main class where the application will boot using
 * spring-boot initialization process. This class contains the
 * {@link #main(String[])} which will be used to initialize the application. <br>
 * -------------------------<br>
 * Date : 05-06-2016 <br>
 * -------------------------<br>
 * 
 * @author anand.kadhi
 */
@SpringBootApplication
public class UttisthaApplication {

	private static Logger LOGGER = Logger.getLogger(UttisthaApplication.class);

	/**
	 * This method will be used to start the Uttishta Application by
	 * initializing the {@link SpringApplication#run(Object, String...) run}
	 * method of {@link SpringApplication}.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("Initilizaing Uttishta Application ...");
		SpringApplication.run(UttisthaApplication.class, args);
	}

}
