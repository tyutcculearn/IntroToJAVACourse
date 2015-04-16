
public class HugeIntegerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HugeInteger x = new HugeInteger("123456789234234");
		HugeInteger y = new HugeInteger("123456789");
		
		boolean result = x.isEqual(y);
		boolean isgreat = x.isGreaterThan(y);
		
		System.out.print(result);
		System.out.print(isgreat);
	}

}
