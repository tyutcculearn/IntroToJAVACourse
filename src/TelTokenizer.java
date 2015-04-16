import java.util.Scanner;


public class TelTokenizer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TelTokenizer();
	}
	
	public TelTokenizer(){
		Scanner input = new Scanner(System.in);
		
		String in = input.nextLine();
		String [] token = in.split("[\t\n\r\f -]");
		for(String t : token){
			System.out.println(t);
		}
	}

}
