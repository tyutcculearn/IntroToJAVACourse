
public class Fibonnaci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%d", calculate(10));
	}
	
	public static int calculate(int number){
		int result;
		if(number == 0){
			return 0;
		}else if (number == 1){
			return 1;
		}else {
			result = calculate(number-1)+calculate(number-2);
		}
		return result;
	}

}
