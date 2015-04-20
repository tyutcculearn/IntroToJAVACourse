import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class Sort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] suits={"Hearts","Diamonds","Clubs","Spades"};
		
		List <String> list = Arrays.asList(suits);
		System.out.printf("Unsorted: %s\n", list);
		Collections.sort(list);
		System.out.printf("Sorted: %s\n",list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.printf("Sorted Inversely: %s\n",list);
		
	}

}
