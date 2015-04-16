import java.util.Scanner;


public class RegionMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new RegionMatch();
	}

	public RegionMatch(){
		Scanner input = new Scanner(System.in);
		String first, second;
		int sIndex, nChar;
		boolean result;
		
		System.out.print("Enter First String");
		first = input.nextLine();
		System.out.print("Enter Second String");
		second = input.nextLine();
		System.out.print("Start index for matching:");
		sIndex = input.nextInt();
		System.out.print("Number of Characters to match");
		nChar = input.nextInt();
		result = first.regionMatches(true, sIndex, second,0,nChar);
		System.out.printf("Result: %b", result);
	}
}
