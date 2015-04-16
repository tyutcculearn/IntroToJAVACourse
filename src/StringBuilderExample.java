
public class StringBuilderExample {

	
	public static void main(String [] args){

		StringBuilder stb = new StringBuilder(20);
		stb.append("Hello");
		System.out.printf("Capacity: %d",stb.capacity());
		System.out.printf("Length: %d", stb.length());
		stb.setLength(45);
		System.out.printf("%s", stb);
		System.out.printf("Length: %d", stb.length());
		
	}
}
