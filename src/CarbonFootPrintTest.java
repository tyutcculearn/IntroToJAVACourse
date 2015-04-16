import java.util.ArrayList;


public class CarbonFootPrintTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Building b = new Building();
		Car c = new Car();
		Bicycle bc = new Bicycle();
		
		ArrayList<CarbonFootPrint> array = new ArrayList<CarbonFootPrint>();
		
		array.add(bc);
		array.add(c);
		array.add(b);
		CarbonFootPrint cf = new Building();
		cf.getCarbonFootPrint();
		
		for(CarbonFootPrint cfp : array){
			System.out.println(cfp.getCarbonFootPrint());
		}
	}

}
