
public class GenericMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] array = {1,2,3,4,5,6,7,8};
		String[] array2 = {"something","anything","clearthing"};
		printArray(array,array2);
		System.out.println(returnMax(10,12,24));
	}
	
	public static <S,T> void printArray(S[]array,T[]array2){
		
		for(S x:array){
			System.out.println(x);
		}
		for(T y:array2){
			System.out.println(y);
		}
	}
	
	public static <T extends Comparable<T>> T returnMax(T x, T y, T z){
		T max = x;
		
		
		return max;
	}

	

}
