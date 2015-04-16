import java.math.BigInteger;


public class HugeInteger {

	private int [] intArray;
	private String intString;
	private int size;
	
	public HugeInteger(String x){
		intArray  = new int[40];
		this.intString = x;
		parse(this.intString);
	}
	private void parse(String input){
		int number;
		//char c;
		for(int i=0;i<input.length();i++){
			//c = input.charAt(i);
			number = Character.getNumericValue(input.charAt(i));
			intArray[i] = number;
		}
		size = input.length();
	}// End of parse method
	
	public boolean isGreaterThan(HugeInteger x){
		boolean result = false;
		String s1="";
		String s2 = "";
		for(int i=0;i<x.size;i++){
			s1 += x.intArray[i];			
		}
		for(int i=0;i<this.size;i++){
			s2 += this.intArray[i];
			
		}
		
		BigInteger temp1 = new BigInteger(s1);
		BigInteger temp2 = new BigInteger(s2);
		System.out.printf("%d", temp2);
		if(temp1.compareTo(temp2) == -1){
			result = true;
		}
		
		return result;
		
	}// End of isGreaterThan 
	
	public boolean isEqual(HugeInteger x){
		boolean result = false;
		int counter=0;
		final int total = 40;
		
		for(int i=0;i<40;i++){
			
			if(this.intArray[i] == x.intArray[i]){
				//System.out.printf("%d - %d ==", this.intArray[i], x.intArray[i]);
				counter++;
			}
		}
		//System.out.println(counter);
		if(counter == total){
			result = true;
		}
		return result;
	}
	
}// End of class
