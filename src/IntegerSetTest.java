import java.util.Random;
public class IntegerSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		IntegerSet a = new IntegerSet();
		IntegerSet b = new IntegerSet();
		
		for(int i=0;i<100;i++){
			a.insertElement(r.nextInt(100));
			b.insertElement(r.nextInt(100));
		}
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
