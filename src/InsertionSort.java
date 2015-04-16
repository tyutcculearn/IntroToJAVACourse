
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a ={23,1,45,123,0,2,1344};
		sort(a);
		for(int n : a){
			System.out.printf("%d ",n);
		}
	}

	public static int [] sort(int [] a){
		 for(int i = 0; i < a.length; i++){

			 int temp = a[i];
			 int j = i;
			 while(j>0 && a[j-1] > temp){
				 a[j] = a[j-1];
				 j--;
			 }
			 a[j] = temp;
			 
		 }
		 
		 return a;
	}
}
