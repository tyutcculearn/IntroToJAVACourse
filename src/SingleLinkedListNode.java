
public class SingleLinkedListNode<T> {

	T data;
	SingleLinkedListNode<T> nextNode;
	

	public SingleLinkedListNode(T object){
		this(object,null);
	}
	
	public SingleLinkedListNode(T object, SingleLinkedListNode<T> node){
		data = object;
		nextNode = node;
	}
	
	T getData(){
		return data;
	}
	
	SingleLinkedListNode<T> getNextNode(){
		return nextNode;
	}
	
}
