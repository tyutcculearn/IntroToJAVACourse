
public class RecursiveFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%d",new RecursiveFactorial().calculate(9));
	}
	
	public int calculate(int number){
		if(number == 1){
			return 1;
		}
		int result = number * calculate(number-1);
		return result;
	}

}
