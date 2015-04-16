
public class Building implements CarbonFootPrint {

	private int floors;
	private String color;
	private String address;
	
	@Override
	public int getCarbonFootPrint(){
		
		return 1;
	}
}
