
public class GenericSelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array = {4,10,98,0,1,23,2,5,6};
		Double[] array1 = {2.3,2.1,1.5,98.0,5.3};
		
		
		for(Integer a : sortArray(array)){
			System.out.printf("%d ",a);
		}
		
		System.out.println();
		
		for(Double d: sortArray(array1)){
			System.out.printf("%.2f ",d);
		}
		
	}
	
	public static <T extends Comparable<T>> T[] sortArray(T array[]){
		
		for(int i= 0; i<array.length ; i++){
			
			for(int j=i+1; j<array.length; j++){
				
				T temp = null;
				if(array[i].compareTo(array[j]) == 1){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
		
		return array;
	}

}
