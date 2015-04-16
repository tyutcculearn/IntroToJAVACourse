import java.util.Scanner;


public class ThreeLetterWords {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ThreeLetterWords();
	}
	
	public ThreeLetterWords(){
		
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		char [] l1 = new char[5];
		char [] l2 = new char[5];
		char [] l3 = new char[5];
	
		for(int i=0;i<word.length();i++){
			l1[i] = word.charAt(i);
			l2[i] = word.charAt(i);
			l3[i] = word.charAt(i);

		}// End of loop
		
		for(int i=0;i<l1.length;i++){
			for(int j=0;j<l2.length;j++){
				for(int k=0;k<l3.length;k++){
					
					if(l1[i] == l2 [j] && l2[j] == l3[k]){
						continue;
					}
					System.out.printf("%c%c%c\n",l1[i],l2[j],l3[k]);
				}
			}
		}
	}

}
