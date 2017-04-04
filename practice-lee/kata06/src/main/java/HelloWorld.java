
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class HelloWorld {

	static {
		try {
			String filePath = "./mylog.log";
			PatternLayout layout = new PatternLayout("%-5p %d %m%n");
			RollingFileAppender appender = new RollingFileAppender(layout, filePath);
			appender.setName("myLog");
			appender.setMaxFileSize("1MB");
			appender.activateOptions();
			Logger.getRootLogger().addAppender(appender);
    	} catch (Exception e) {
			e.printStackTrace();
    	}
	}

    public static void main(String[] args) {
    	Logger log = Logger.getLogger("myLog");

        System.out.println("System:: Hello World!");
        log.info("log4j:: Hello World!");
    }

    public static String getHello() {
    	return "Hi";
    }
}