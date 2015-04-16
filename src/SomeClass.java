public class SomeClass {

	public SomeClass() throws Exception{
		
		throw new Exception("Constructor Failure!");
	}
	
	public static void main(String [] args){
		
		try{
			new SomeClass();
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
