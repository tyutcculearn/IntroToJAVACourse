import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;


public class CollectionTest {

	public static void main(String[] args){
		
		String [] colors = {"MAGNETA","RED","WHITE","BLUE","CYAN"};
		List<String> list = new ArrayList<String>();
		
		for(String c: colors){
			list.add(c);
		}
		
		String[] removeColors = {"RED","WHITE","BLUE"};
		List<String>removeList = new ArrayList<String>();
		
		for(String c:removeColors){
			removeList.add(c);
		}
		
		System.out.println("Array List:");
		
		for(int i = 0; i < list.size();i++ ){
			System.out.println(list.get(i));
		}
		
		removeC(list,removeList);
		
		System.out.println("\n\nArray after calling removeC: ");
		for(String c:list){
			System.out.println(c);
		}
		
		int[] a = {1,2,3,4,5,6,7};
		int x = 10;
		rArray(a,x);
		for(int i:a){
			System.out.printf("%d ",i);
		}
		System.out.println(x);
	}
	
	public static void removeC(Collection<String> c1, Collection<String>c2){
		
		Iterator<String> iterator = c1.iterator();
		while(iterator.hasNext()){
			if(c2.contains(iterator.next()))
				iterator.remove();
		}
	}
	
	public static void rArray(int [] array, int x){
		for(int i=0;i<array.length;i++){
			array[i]++;
		}
		x++;
	}
}
