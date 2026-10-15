package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsMain {
	public static Logger logger = LoggerFactory.getLogger(JenkinsMain.class);
	public static void main(String[] args) {
		SpringApplication.run(JenkinsMain.class, args);
		logger.info("** first commit **");  
	}

}
