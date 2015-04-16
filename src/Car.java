
public class Car implements CarbonFootPrint {

	private String model;
	private String company;
	private String color;
	
	@Override
	public int getCarbonFootPrint(){
		
		return 2;
	}
	
}
