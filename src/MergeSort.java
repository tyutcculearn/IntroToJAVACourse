
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {9,8,7,6,1000,5,4,3,2,1,0,123,234,190};
		int [] b = arraySort(a,0,a.length-1);
		for(int c: b){
			System.out.print(c+" ");
		}

	}

	public static int[] arraySort(int [] array ,int initialIndex, int lastIndex){
		int [] sortedArray;
		
		if(initialIndex == lastIndex){
			int [] newArray = new int[1];
			newArray[0] = array[initialIndex];
			return newArray;
		}else{
			int midPoint = (initialIndex + lastIndex)/2;
			int newInitial = midPoint+1;
			int [] firstHalf = arraySort(array,initialIndex,midPoint);
			int [] secondHalf = arraySort(array,newInitial, lastIndex);
			sortedArray = mergeArray(firstHalf,secondHalf);
			return sortedArray;
		}
		
	}
	
	public static int[] mergeArray(int [] firstArray, int [] secondArray){
		
		int [] mergedArray = new int[firstArray.length+secondArray.length];
		
		int firstArrayIndex = 0;
		int secondArrayIndex = 0;
		int mergedArrayIndex = 0;
		
		while(firstArrayIndex < firstArray.length && secondArrayIndex < secondArray.length){
			
			if(firstArray[firstArrayIndex] < secondArray[secondArrayIndex]){
				mergedArray[mergedArrayIndex++] = firstArray[firstArrayIndex++];
			}else{
				mergedArray[mergedArrayIndex++] = secondArray[secondArrayIndex++];
			}
		}
		
		if(firstArrayIndex >= firstArray.length){
			while(secondArrayIndex < secondArray.length){
				mergedArray[mergedArrayIndex++] = secondArray[secondArrayIndex++];
			}
		}
		
		if(secondArrayIndex >= secondArray.length){
			while(firstArrayIndex < firstArray.length){
				mergedArray[mergedArrayIndex++] = firstArray[firstArrayIndex++];
			}
		}
		
		return mergedArray;
	}

}
