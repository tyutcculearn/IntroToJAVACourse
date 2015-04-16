import java.util.Scanner;

public class ArrayErrorHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] x = new int[12];
		for(int i=0;i<13;i++){
			System.out.printf("Enter a Number: ");
			try{
				x[i] = input.nextInt();
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.printf("Error: %s",e);
			}
			
		}
		
	}

}
