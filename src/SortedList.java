import java.util.Random;


public class SortedList<T extends Comparable<T>>{


	private String listName;
	private SortedListNode<T> head;
	private SortedListNode<T> tail;
	
	public SortedList(){
		this ("list");
	}
	
	public SortedList(String listName){
		this.listName = listName;
		head = tail = null;
	}
	
	public static <S extends Comparable<S>> SortedList<S> reverse(SortedList<S> list){
		
		SortedList<S> result = new SortedList<S>("Reversed List");
		SortedListNode<S> listCurrent = list.head;
		
		while(listCurrent != null){
			
			if(result.head == null){
				result.head = listCurrent;
				result.tail = listCurrent;
			}else{
				result.head = listCurrent;
				listCurrent.nextNode = result.tail;
			}
			listCurrent = listCurrent.nextNode;
		}
		
		return result;
	}
	
	public void insertData(T data){
		
		SortedListNode<T> newNode = new SortedListNode<T>(data);
		
	 	if(isEmpty()){
			
			head = tail = newNode;
		
		}else if(data.compareTo(tail.getData()) > 0 ){
			
			
			tail.nextNode = newNode;
			tail = newNode;
			
			
		}else if(data.compareTo(head.getData()) < 0){
			
			newNode.nextNode = head;
			head = newNode;
			
		}else{
			// get the previous of the current node?
			insert(newNode);
		}
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	private void insert(SortedListNode<T> newNode){
		
		SortedListNode<T> previous = head;
		SortedListNode<T> current = previous.nextNode;
		
		while(current != null){
			
			if(newNode.getData().compareTo(current.getData()) < 0){
				
				newNode.nextNode = current;
				previous.nextNode = newNode;
				break;
			}
			previous = previous.nextNode;
			current = previous.nextNode;
		}
		
	}
	
	public SortedList<T> merge(SortedList<T> l1, SortedList<T> l2){
		SortedList<T> merged = new SortedList("Merged List");
		
		SortedListNode<T> l1C = l1.head;
	 
		SortedListNode<T> l2C =  l2.head;
		
		SortedListNode<T> mC = null;
		
		while(l1C != null && l2C != null){
			
			if(l1C.getData().compareTo(l2C.getData()) <= 0 ){
				
				if(merged.head == null){
					
					merged.head = l1C;
					merged.tail = l1C;
					mC = merged.head;
				}else{
					mC.nextNode = l1C;
					mC = mC.nextNode;
					merged.tail = mC;
				}
				
				l1C = l1C.nextNode;
			}else{
				if(merged.head == null){
					merged.head = l2C;
					merged.tail = l2C;
					mC = merged.head;
				}else{
					mC.nextNode = l2C;
					mC = mC.nextNode;
					merged.tail = mC;
				}
				l2C = l2C.nextNode;
			}
		}
		
		if(l1C == null){
			
			while(l2C != null){
				if(merged.head == null){
					merged.head = l2C;
					merged.tail = l2C;
					mC = merged.head;
				}else{
					mC.nextNode = l2C;
					mC = mC.nextNode;
					merged.tail = mC;
				}
				l2C = l2C.nextNode;
			}
		}

		if(l2C == null){
			
			while(l1C != null){
				if(merged.head == null){
					merged.head = l1C;
					merged.tail = l1C;
					mC = merged.head;
				}else{
					mC.nextNode = l1C;
					mC = mC.nextNode;
					merged.tail = mC;
				}
				l1C = l1C.nextNode;
			}
		}
		
		return merged;
	}
	public void print(){
		SortedListNode<T> current = head;
		while(current != null){
			System.out.print(current.getData());
			System.out.print(" ");
			current = current.nextNode;
		}
	}
	
	public static void main(String [] args){
		SortedList<Integer> list1 = new SortedList<Integer>("New Integer List1");
		SortedList<Integer> list2 = new SortedList<Integer>("New Integer List2");
		Random r = new Random();
		
		for(int i = 0; i < 15;i++){
			list1.insertData(r.nextInt(50));
			list2.insertData(r.nextInt(50));
		}

		list1.print();
		System.out.println();
		list2.print();
		System.out.println();
		SortedList<Integer> merged = list1.merge(list1, list2);
		merged.print();
	}
}
