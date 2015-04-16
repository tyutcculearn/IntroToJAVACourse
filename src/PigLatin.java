import java.util.Scanner;


public class PigLatin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new PigLatin();
	}

	public PigLatin(){
		
		String sentence, translation;
		String [] tokens;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter A Sentence:");
		sentence = input.nextLine();
		tokens = sentence.split(" ");
		for(int i=0;i<tokens.length;i++){
			String temp = tokens[i]+tokens[i].charAt(0)+"ay";
			temp = temp.toLowerCase();
			tokens[i] = temp.substring(1);
		}
		for(String token: tokens){
			System.out.printf("%s ",token);
		}
	
		
		
	}
}
