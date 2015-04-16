
public class BubbleSort {
	int counter = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1000,0,9,8,7,6,5,4,100,500,3,2,1};
		BubbleSort x = new BubbleSort();
		int [] b =  x.sortArray(a);
		for(int c: b){
			System.out.print(c + " ");
		}
		System.out.println(x.counter);
	}
	

	public int[] sortArray(int [] array){
		int passes = array.length;
		
		for(int j=0;j<array.length;j++){
			
			for(int i=1;i< passes;i++){
				
				if(array[i-1] > array[i]){
					
					array = swap(array,i-1);
					counter++;
				}

			}


			passes--;
		}

		
		
		return array;
	}
	
	public int[] swap(int [] array, int index){

		int temp = 0;
		
		temp = array[index+1];
		array[index+1] = array[index];
		array[index] = temp;
		return array;
	}

}
