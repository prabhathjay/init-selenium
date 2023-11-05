package testPackage;

public class ExceptionHandlingDemo {

//	public static void main(String[] args) {
//		
//		try {
//			System.out.println("Hello World!");
//			int i = 1/0;
//			System.out.println("Session completed");
//			
//		} catch (Exception e) {
//			System.out.println("Exception : "+e.getMessage());
//			System.out.println("Session completed from catch block");
//		}
//
//	}
	
	
	
	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Session completed from catch block");
		}

	}
	
	public static void demo() throws Exception {
		
			System.out.println("Hello World!");
			int i = 1/0;
			System.out.println("Session completed");
			System.out.println("Session completed from catch block");
	}

}
