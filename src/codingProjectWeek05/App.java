package codingProjectWeek05;

public class App {

	public static void main(String[] args) {
	
	AsteriskLogger logger = new AsteriskLogger();
	
			logger.signIn("HI");
			logger.invaildLogin("HI");
	  	SpacedLogger slogger = new SpacedLogger();
	
		slogger.Log("Hello");
		slogger.Error("Hello");
		

			
	}
	
	

}
