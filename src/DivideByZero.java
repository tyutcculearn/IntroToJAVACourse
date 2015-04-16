import java.util.InputMismatchException;
import java.util.Scanner;
public class DivideByZero {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;
		do{
			try{
				System.out.printf("Enter first number: ");
				int a = input.nextInt();
				System.out.printf("Enter second number: ");
				int b = input.nextInt();
				int temp = division(a,b);
				System.out.printf("The result is: %d \n", temp);
				continueLoop = false;
			}catch(InputMismatchException e1){
				System.out.printf("Error: %s \n",e1.getMessage());
				input.nextLine();
			}catch(ArithmeticException e2){
				System.out.printf("Error: %s\n", e2.getMessage());
			}
			
		}while(continueLoop);
	}
	
//	public DivideByZero(int a, int b){
		
//		try{
//			int temp = a / b;
//			System.out.printf("The Result: %d", temp);
//		}catch(ArithmeticException e){
//			System.out.printf("Error:%s",e.getMessage());
//		}
//	}

	
	public static int division(int a, int b){
		
		int temp = a/b;
		return temp;
	}
}
