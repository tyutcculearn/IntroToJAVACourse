
public class ExceptionC extends ExceptionB{


	public ExceptionC(String m) throws Exception {
		super(m);
		throw new ExceptionB(m);
	}
	
	public static void main(String [] args) throws Exception{

			getException();
	
		
	}
	
	public static void getException() throws Exception{
	
			new ExceptionC("An exception thrown in here");
	}
	

}
