import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;


public class FileDemo {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("/home/sjahed/Downloads/somefile.txt");
		System.out.println(file.exists());
		Scanner input;//, keyboard;
		//Formatter output = new Formatter("/home/sjahed/Downloads/file.txt");
		
		try{
			FileReader fr = new FileReader(file);
			input = new Scanner(fr);
			do{
				System.out.println(input.next());	
			}while(input.hasNext());
//			keyboard = new Scanner(System.in);
//			System.out.print("Enter something to add to file:");
//			output.format("This line should be added to the file!", keyboard.nextLine());
//			output.close();
			
			
			fr.close();
			
		}catch(FileNotFoundException e){
			System.err.print("File Not Foudn");
			e.printStackTrace();
		}catch(IOException e){
			System.err.print("Can't close it");
		}
		
	}
	

}
