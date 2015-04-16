import java.util.Scanner;

public class TicTacToe {

	private Values [][] value;
	private boolean flag;
	
	public TicTacToe(){
		value = new Values[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				value[i][j] = Values.EMPTY;
			}// End of inner for 
		}// End of outer for
		int counter=0;
		int [] u1,u2;
		do{
			drawTable(value);
			u1 = getUserInput("User One INPUT:");
			while(!isEmpty(value,u1)){
				System.out.println("That cell is not empty!");
				u1=getUserInput("User One INPUT:");
			}
			value[u1[0]][u1[1]] = Values.X;
			
			u2 = getUserInput("User Two INPUT:");
			while(!isEmpty(value,u2)){
				System.out.println("That cell is not empty!");
				u2=getUserInput("User Two INPUT:");
			}
			value[u2[0]][u2[1]] = Values.O;
			
			
			counter++;
		}while(counter<9);
		
	}// End of constructor
	
	private boolean isWinner(Values [][] v){
		boolean result = false;

		
		return result;
	}
	
	
	private boolean isEmpty(Values [][] v,int [] c){
		boolean result = false;
		
		if(v[c[0]][c[1]] == Values.EMPTY){
			result = true;
		}
		
		return result;
	}// End of isEmpty
	
	private int[] getUserInput(String message){
		int [] result = new int[2];
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		result[0] = input.nextInt();
		result[1] = input.nextInt();
		
		return result; 
	}
	
	private void drawTable(Values [][] v){
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(v[i][j] == Values.EMPTY){
					System.out.printf(" %s ","E");
				}else if(v[i][j] == Values.O){
					System.out.printf(" %s ", "O");
				}else{
					System.out.printf(" %s ","X");
				}
			}// End of inner for loop
			System.out.println();
		}// End of outer for loop
		
	}// End of drawTable method
	
}// End of class

