
public class RecursiveMinimum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {-2,1,324,12344,125,2,234,125,23,-1,3};
		System.out.printf("%d", findMin(array,0));
	}

	public static int findMin(int [] array, int searchIndex){
		int min = Integer.MAX_VALUE;
		int result = min;
		
		if(searchIndex == array.length-1){
			if(min > array[searchIndex]){
				result = array[searchIndex];
			}
			
		}else if(array[searchIndex] < min) {
			min = array[searchIndex];
			result = findMin(array, searchIndex+1);
			if(result > min ){
				result = min;
			}
		}
		return result;
	}
}
