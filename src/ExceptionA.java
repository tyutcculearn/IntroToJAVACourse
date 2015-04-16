
public class ExceptionA extends Exception{


	public ExceptionA(String m) throws Exception{
		super(m);
		throw new Exception(m);
	}

}
