package codingProjectWeek05;

public class SpacedLogger  {

	  private String log;
	  private String error;
	  
	
	public void Log(String log) {
		this.log = log;
		StringBuilder logIn = new StringBuilder();
		for ( int i = 0; i < log.length(); i++) {
			if( i > 0) {
				logIn.append(" ");
			}
			logIn.append(log.charAt(i));
		}
		System.out.println(logIn.toString());
	}
	
	public void Error(String error) {
		this.error = error;
		StringBuilder inVaild = new StringBuilder();
		for ( int i = 0; i < error.length(); i++) {
			if( i > 0) {
				inVaild.append(" ");
			}
			inVaild.append(error.charAt(i));
		}
		System.out.println("ERROR:" + inVaild.toString());
	}
	  
	  
	  
	  
}
