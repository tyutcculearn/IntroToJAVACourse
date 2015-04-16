import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PathsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Path path = Paths.get("in.txt");
		path.toAbsolutePath();
		System.out.printf("%s",path.toAbsolutePath());

	
		
	}

}
