
public class ChessExample {


	private int[][] board = new int[8][8];
	private boolean[][] visited = new boolean[8][8];
	private int [][] move = {{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2}};
	private int counter = 1;
	private int [][]tracker = new int[8][8];
	private int currentRow = 0;
	private int currentCol = 0;
	private boolean endFlag = false;

	public ChessExample(){
		visited[currentRow][currentCol] = true;
		tracker[currentRow][currentCol] = counter;
		counter++;
		// Maximum number of moves
		for(int mCount = 0; mCount<64;mCount++){
//			if(counter == 42 || counter == 43){
//				System.out.printf("BEFORE:Row: %d Col: %d \n", getCurrentRow(),getCurrentCol());
//			}
			// Find the next Move
			int [][]nextMove = findNextMove(getCurrentRow(),getCurrentCol());
			
			if(getEndFlag()){
				break;
				
			}
			

			setCurrentRow(nextMove[0][0]);
			setCurrentCol(nextMove[0][1]);
//			
//			if(counter == 42|| counter == 43){
//				System.out.printf("AFTER:Row: %d Col: %d \n", getCurrentRow(),getCurrentCol());
//			}
			this.visited[getCurrentRow()][getCurrentCol()] = true;
			this.tracker[getCurrentRow()][getCurrentCol()] = counter;
			counter++;

		}
		
	}// end of constructor
	/*
	 * set currentRow position of the knight
	 */
	private void setCurrentRow(int currentRow){
		this.currentRow = currentRow;
	}
	/*
	 * returns currentRow position of the knight
	 */
	public int getCurrentRow(){
		return currentRow;
	}
	/*
	 * set currentCol position of the knight
	 */
	private void setCurrentCol(int currentCol){
		this.currentCol = currentCol;
	}
	/*
	 * returns currentCol position of the knight
	 */
	public int getCurrentCol(){
		return currentCol;
	}
	/*
	 * set end flag
	 */
	private void setEndFlag(boolean flag){
		this.endFlag = flag;
	}
	/*
	 * return endFlag
	 */
	private boolean getEndFlag(){
		return this.endFlag;
	}
	/*
	 * returns what next move should the knight do
	 */
	public int[][] findNextMove(int currentRow, int currentCol){
		int [][] nextMoveResult = new int[1][2];
	
		// loop thorough all the possible moves
		for(int r=0;r<8;r++){
			int interimRow = currentRow;
			int interimCol = currentCol;
			for(int c=0;c<2;c++){
				nextMoveResult[0][c] = this.move[r][c];
			}
			interimRow += nextMoveResult[0][0];
			interimCol += nextMoveResult[0][1];
			
			
			if(!validMove(interimRow,interimCol) ){
				setEndFlag(true);
				continue;
			}else{
				setEndFlag(false);
				nextMoveResult[0][0] = interimRow;
				nextMoveResult[0][1] = interimCol;
				break;
			}
		}
		return nextMoveResult;
		
	}
	/*
	 * valid move - returns false if not a valid move
	 */
	private boolean validMove(int row, int col){
		boolean result = false;
		if(row>=8 || row<0 || col>=8 || col<0 || this.visited[row][col] == true){
			result = false;
		}else{
			result = true;
		}
		
		return result;
		
	}
	
	/*
	 * print the visited table
	 */
	public void printResult(){
		for(int r=0;r<8;r++){
			for(int c=0;c<8;c++){
				System.out.printf(" %2d ", this.tracker[r][c]);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		ChessExample x = new ChessExample();
		x.printResult();
	}
	
	
}
