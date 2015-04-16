
public class IntegerSet {

	private boolean [] set;
	
	public IntegerSet(){
		
		set = new boolean[100];
		for(int i = 0;i<100;i++){
			set[i]= false;
		}
	
	}
	
	public static IntegerSet union(IntegerSet a, IntegerSet b){
		IntegerSet c = new IntegerSet();
		for(int i=0;i<100;i++){
			
			if(a.set[i] == true || b.set[i] == true){
				c.set[i] = true;
			}
		}
		return c;
	}// End of union

	public static IntegerSet intersection(IntegerSet a, IntegerSet b){
		IntegerSet c = new IntegerSet();
		for(int i=0;i< 100;i++){
			if (!a.set[i] || !b.set[i]){
				c.set[i] = false;
			} else {
				c.set[i] = true;
			}
		}
		return c;
	}// End of Intersection
	
	public void insertElement(int a){
		if((a >= 0 || a < 100 )&& !this.set[a]){
			this.set[a] = true;
		}
	}// End of insertElement
	
	public String toString(){
		String result = "";
		for(int i=0;i<100;i++){
			if(this.set[i]){
				result += "--"+ i;
			}
		}
		
		return result;
	}
	
}// End of class
