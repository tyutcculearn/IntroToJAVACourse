import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] colors = {"red","blue","magneta","black","white"};
		List<String> list1 = new LinkedList<String>();
		
		for(String c:colors){
			list1.add(c);
		}
		
		String[] colors2 = {"pink","brown","yellow"};
		List<String>list2 = new LinkedList<String>();
		for(String c:colors2)
			list2.add(c);
		
		if(list1.addAll(list2))
			list2 = null;

		toUpperCase(list1);
		Iterator<String>iterator = list1.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		list1.remove(0);
		System.out.println("===========");
		Iterator<String>iterator2 = list1.iterator();
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}

	}
	
	public static void toUpperCase(List<String> list){
		ListIterator<String> iterator = list.listIterator();

		while(iterator.hasNext()){
			String s = iterator.next();
			iterator.set(s.toUpperCase());
		}
	}

}
