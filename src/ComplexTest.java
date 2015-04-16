 
public class ComplexTest {

	public static void main(String [] args){
		Complex a = new Complex(7.7,3.4);
		Complex b = new Complex(3.4, 1.3);
		
		Complex c = a.add(b);
		Complex d = a.sub(b);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
	}
}
