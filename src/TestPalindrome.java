
public class TestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] array = {'a','m','a','n','a','p','l','a','n','a','c','a','n','a','l','p','a','n','a','m','b'};
		System.out.printf("%b",testPalindrome(array, 0,array.length-1));

	}

	public static boolean testPalindrome(char [] array, int startIndex, int lastIndex){
		boolean result = false;
		 if(array.length%2 == 1 && startIndex == lastIndex && array[startIndex-1] == array[lastIndex+1]){
			 result = true;
		 }else if(array.length%2 == 0 && startIndex == array.length/2 && array[startIndex] == array[lastIndex]){
			 result = true;
		 }else if(array[startIndex] == array[lastIndex]) {
			 result = testPalindrome(array, startIndex+1, lastIndex-1);
		 }
		 return result;
	}
}
