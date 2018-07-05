import org.apache.log4j.*;
//import org.apache.log4j.PropertyConfigurator;


public class Log4jEx {

	final static Logger logger = Logger.getLogger(Log4jEx.class);
	public Log4jEx() {}
	public static void main(String[] args) {
		//PropertyConfigurator.configure("E:\\Eclipse1\\Log4jProject\\src\\log4j.properties");
//String s;
		// TODO Auto-generated method stub
	//for(int i=0;i<200;i++)
	logger.info("this info is log info");
	logger.fatal("this info is log info");
	logger.warn("this info is log info");
	logger.debug("this info is log info");
	logger.error("this info is log info");
	logger.trace("this info is log info");
	}

}
