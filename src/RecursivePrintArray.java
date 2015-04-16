
public class RecursivePrintArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {1,3,4,5,6,1,34,132,45,12,435};
		printArray(array,0);
	}
	
	public static void printArray(int [] array, int printIndex){
		if(printIndex == array.length - 1){
			System.out.printf("%d",array[printIndex]);
			return;
		}else{
			System.out.printf("%d ",array[printIndex]);
			printArray(array,printIndex+1);
		}
	}

}
