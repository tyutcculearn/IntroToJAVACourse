
public class StackLinkedList<T> {


	private String name;
	StackNode<T> firstNode;
	
	public StackLinkedList(){
		this("list");
	}
	
	public StackLinkedList(String name){
		this.name = name;
	}
	
	public void push(StackNode<T> node){
		
		if(isEmpty()){
			firstNode = node;
			firstNode.nextNode = null;
		}
		else{
			
		}
	}
	private boolean isEmpty(){
		return firstNode == null;
	}
	
}
