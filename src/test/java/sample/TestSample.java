package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sample.service.SampleService;

@SpringBootTest
public class TestSample {
	Logger logger = LoggerFactory.getLogger(TestSample.class);
	@Autowired
	SampleService service = new SampleService();
	
	@Test
	public void testAdd() {
		logger.info("** testAdd() executed once.."); 
		assertEquals("added", service.add("java"));  
	}
}
