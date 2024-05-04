package codingProjectWeek05;



public class AsteriskLogger  {
	private String log;
	private String error;
	
	

	public void signIn(String log) {
		this.log = log; 
		
		System.out.println("***" + log + "***");
	
		
	}

	public void invaildLogin(String error) {
		// TODO Auto-generated method stub
		this.error = error;
		
		
		System.out.println("**********");
		System.out.println("***" + "Error:" + error + "***");
		System.out.println("**********");
	}

	
	
	
	
	
	
}
