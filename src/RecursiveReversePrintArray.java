
public class RecursiveReversePrintArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] array = "This is a message from me".toCharArray();
		printArray(array,array.length-1);
	}
	
	public static void printArray(char [] array,int printIndex){
	
		if(printIndex == 0){
			System.out.printf("%c",array[printIndex]);
		}else{
			System.out.printf("%c",array[printIndex]);
			printArray(array,printIndex-1);
		}
	}

}
