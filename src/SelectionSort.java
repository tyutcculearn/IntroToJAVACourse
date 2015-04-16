
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {34,123,45,1200,0,-1,12,1,5,2341};
		int [] result = sort(array);
		for(int a : array){
			System.out.printf("%d ", a);
		}
	}

	public static int [] sort(int [] array){
		int temp = 0;
		for(int i=0;i<array.length;i++){
		
			for(int j=i+1;j<array.length;j++){
				if(array[i] > array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
