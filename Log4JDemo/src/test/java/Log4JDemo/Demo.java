package Log4JDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void m1(){
		//which  we want to create log file in my case Demo is classname
		Logger logger=Logger.getLogger("Demo");
		
		// configure log4j properties file
	    PropertyConfigurator.configure("log4j.properties");
	    
	    logger.info("i am information");
	    
	    
	}
}
