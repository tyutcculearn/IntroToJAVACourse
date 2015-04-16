import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharacterCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader r = null;
		FileWriter w = null;
		int c;
		
		try{
			r = new FileReader("/home/sjahed/workspace/IntroToJAVACourse/src/in.txt");
			w = new FileWriter("/home/sjahed/workspace/IntroToJAVACourse/src/out.txt");
	
			while((c = r.read()) != -1){
				System.out.printf("%c\n", (char)c);
				w.write(c);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(r != null && w != null){
				r.close();
				w.close();
			}
		}

	}

}
