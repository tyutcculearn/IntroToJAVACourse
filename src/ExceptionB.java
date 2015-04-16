
public class ExceptionB extends ExceptionA{

	public ExceptionB(String m) throws Exception{
		super(m);
		throw new ExceptionA(m);
	}

}
