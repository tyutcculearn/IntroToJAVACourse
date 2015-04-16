
public class EnumTest {

	public enum company{
		Ebay, Yahoo, Google, Microsoft;
	}
	
	/**
	 * @param args
	 */
	private company c;
	EnumTest(company c){
		this.c = c;
	}
	
	private void printData(){
		
		switch(c){
		
		case Ebay:
			System.out.println("A company built by Piere!");
			break;
		case Yahoo:
			System.out.println("A company that was once popular");
			break;
		case Google:
			System.out.println("A leading company in innovation");
			break;
		case Microsoft:
			System.out.println("A compnay led by a semi genius guy");
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		company c = company.Google;
		EnumTest et = new EnumTest(c);
		et.printData();
	}

}
