
public class RethrowingExceptions {

	public static void someMethod() throws Exception{
		
		try{
			someMethod2();
		}catch(Exception e){
			System.out.println(e.getMessage());
			throw e;
		}
		
	}
	
	public static void someMethod2() throws Exception{
		throw new Exception("An Exception that is thrown in method 2");
	}
	
	public static void main(String[] args){
		try{
			someMethod();
		}catch(Exception e){
			e.printStackTrace();
		}
		 
		
	}
}
