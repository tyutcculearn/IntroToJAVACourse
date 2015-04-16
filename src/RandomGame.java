import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char answer = 'y';
		Scanner input = new Scanner(System.in);
		
		do{
			int x1 = randomGenerator();
			int x2 = randomGenerator();
			System.out.printf("What is the result of %d times %d:", x1,x2);
			int ans1 = input.nextInt();

			if(ans1 != (x1 * x2)){
				
				do{
					System.out.printf("Sorry! Try Again!\n");
					System.out.printf("What is the result of %d times %d:", x1,x2);
					ans1 = input.nextInt();
				}while(ans1 != (x1 * x2));
			}
			if( ans1 == (x1 * x2) ){
				System.out.printf("Congrats!\n");
				continue;
			}
			
		}while(answer == 'y');
	}

	private static int randomGenerator(){
		Random r = new Random();
		int result = r.nextInt(10)+1;
		return result;
	}
}
