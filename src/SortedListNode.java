
public class SortedListNode<T> {

	T number;
	SortedListNode<T> nextNode;
	
	public SortedListNode(T number){
		this(number,null,null);
	}
	public SortedListNode(T number, SortedListNode<T> nextNode, SortedListNode<T> prevNode){
		this.number = number;
		this.nextNode = nextNode;
	}
	
	
	public T getData(){
		return number;
	}
}
