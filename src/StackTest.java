
public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stringStack = new Stack<String>(20);
		stringStack.push("Something");
		stringStack.push("wonderful");
		System.out.println(stringStack.pop());
	}

}
