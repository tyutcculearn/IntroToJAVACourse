import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ScanXan {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scanner = null;
		BufferedWriter bw = null;
		
		try{
			scanner = new Scanner( new BufferedReader(new FileReader("/home/sjahed/workspace/IntroToJAVACourse/src/in.txt")));
			bw = new BufferedWriter(new FileWriter("/home/sjahed/workspace/IntroToJAVACourse/src/out.txt"));
			
			while(scanner.hasNext()){
				//System.out.printf("%s\n", scanner.nextLine());
				bw.write(scanner.nextLine());
				bw.write("\n");
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			scanner.close();
			bw.close();
		}
	}

}
