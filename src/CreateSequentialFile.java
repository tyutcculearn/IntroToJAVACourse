import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CreateSequentialFile {

	private ObjectOutputStream output;
	
	public void openFile(){
		
		try{
			output = new ObjectOutputStream(new FileOutputStream("clients.ser"));
			
		}catch (IOException e){
			System.err.println("Error opening file");
		}
	}
	
	public void addRecords(){
		AccountSerializable record;
		int accountNumber;
		String firstName;
		String lastName;
		double balance;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter Data: ");
		
		while(input.hasNext()){
			try{
				accountNumber = input.nextInt();
				firstName = input.next();
				lastName = input.next();
				balance = input.nextDouble();
				
				record = new AccountSerializable(accountNumber, firstName, lastName, balance);
				output.writeObject(record);
			}catch (IOException e){
				System.err.println("Error Writing to File");
				return;
			}catch(NoSuchElementException e){
				System.err.println("Invalid input");
				input.nextLine();
			}
		}
	}
	
	public void closeFile(){
		try{
			output.close();
		}catch(IOException e){
			System.err.println("Can't close file");
			System.exit(1);
		}
	}
	
	public static void main(String [] args){
		CreateSequentialFile f = new CreateSequentialFile();
		f.openFile();
		f.addRecords();
		f.closeFile();
	}
}
