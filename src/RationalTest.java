
public class RationalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rational y = new Rational(3,4);
		Rational x = new Rational (5,6);
		Rational z = Rational.addition(x, y);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
