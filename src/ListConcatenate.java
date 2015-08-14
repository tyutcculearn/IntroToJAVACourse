import java.util.LinkedList;


public class ListConcatenate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Character> l1 = new LinkedList<Character>();
		l1.add('a');
		l1.add('b');
		l1.add('c');
		LinkedList<Character> l2 = new LinkedList<Character>();
		l2.add('d');
		l2.add('e');
		l2.add('f');
		
		concatenate(l1,l2);
		
		System.out.println(l1.toString());
	}

	
	public static void concatenate(LinkedList lOne, LinkedList lTwo){
		 lOne.addAll(lTwo);
	}
}
