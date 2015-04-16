import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInputStreamDemo {


	public FileInputStreamDemo() throws IOException{
		

		FileInputStream in = null;
		FileOutputStream out = null;
		try{
			
			in = new FileInputStream("/home/sjahed/workspace/IntroToJAVACourse/src/in.txt");
			out = new FileOutputStream("/home/sjahed/workspace/IntroToJAVACourse/src/out.txt");
			int c;
				
			//byte [] b = "This is a string and some number strings here".getBytes();
			byte [] b = "something".getBytes();
			while((c = in.read()) != -1){
				
				out.write(c);
			}
		
			
		}catch (IOException e){
			System.out.printf("exception");
			e.printStackTrace();
		}finally{
			if(in != null && out != null){
				in.close();
				out.close();
			}

		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		new FileInputStreamDemo();
	}
	
	

}
