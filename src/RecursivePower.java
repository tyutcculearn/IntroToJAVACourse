import java.math.BigInteger;


public class RecursivePower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%d",power(BigInteger.valueOf(2),BigInteger.valueOf(64)));
		
	}

	public static BigInteger power(BigInteger base, BigInteger power){
		
		if(power.equals(BigInteger.ONE)){
			return base;
		}else {
			return base.multiply(power(base, power.subtract(BigInteger.ONE)));
		}
	}
}
