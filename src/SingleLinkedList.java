
public class SingleLinkedList<T> {

	private SingleLinkedListNode<T> firstNode;
	private SingleLinkedListNode<T> lastNode;

	public SingleLinkedList(T object){

		this(object,null);
		
	}
	
	public SingleLinkedList(T object, SingleLinkedListNode<T> nextNode){
		
		if(isEmpty()){
			firstNode = lastNode = new SingleLinkedListNode<T>(object,nextNode);
		}else{
			lastNode = lastNode.nextNode = new SingleLinkedListNode<T>(object,nextNode);
		}
	}
	
	public void print(){
		SingleLinkedListNode<T> current = firstNode;
		
		while(current != null){
			System.out.println(firstNode.data);
			current = current.nextNode;
		}
	}

	private boolean isEmpty(){

		return firstNode == null;
	}
}
