
public class StackNode<T> {

	T data;
	StackNode<T> nextNode;

	public StackNode(T object){
		this(object,null);
	}
	
	public StackNode(T object, StackNode<T> node){
		data = object;
		nextNode = node;
	}
	
	public T getData(){
		return data;
	}
	public StackNode<T> getNextNode(){
		return nextNode;
	}

}
