import java.util.Scanner;

public class Toeknizer {

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter A Sentence:");
		
		String sentence = input.nextLine();
		String [] tokens = sentence.split(" ");
		for(String s: tokens){
			System.out.printf("%s \n", s);
		}
	}
}
