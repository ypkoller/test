package ch.ysc.first.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Start {
	
	private final static Logger s_logger = LogManager.getLogger();
	public String sayHelloWorld(){
		s_logger.info("Start Hello World");
		return "Hello World !!!";
	}

}
