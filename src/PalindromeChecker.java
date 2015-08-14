
public class PalindromeChecker {

	private String s;
	NodeStack normal;
	NodeStack reverse;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PalindromeChecker checker = new PalindromeChecker("race car");
		System.out.println(checker.palindrome());
	}

	public PalindromeChecker(String s){
	
		this.s = s;
		
		normal = new NodeStack();
		reverse = new NodeStack();
		
		for(int i = 0;i<s.length();i++){

			if(s.charAt(i) != ' ')
				normal.push(s.charAt(i));
		}
		for(int i = s.length() -1; i>=0 ;i--){
			
			if(s.charAt(i) != ' '){
				reverse.push(s.charAt(i));
			}
		}
		
		
	}
	
	public boolean palindrome(){
		boolean result = false;
		
		while(!normal.isEmpty()){

			if(normal.pop().data != reverse.pop().data){

				result = false;
				break;
			}
			result = true;
		}
		
		return result;
	}


	class Node{
		Node next;
		char data;
		
		Node(char data){
			this.data = data;
			next = null;
		}
	}
	
	class NodeStack{
		private Node head;
		
		public void push(char c){
			Node newNode = new Node(c);
			
			newNode.next = head;
			head = newNode;
		}
		public Node pop(){
			Node popedNode = null;
			
			if(head != null){
				popedNode = head;
				head = head.next;
			}
			
			return popedNode;
		}
		
		public boolean isEmpty(){
			return head == null;
		}
	}
}
