import java.util.Random;


public class MazeTraverse {
	private static boolean eFound = false;
	private static boolean emptyCellFound = false;
	private static final int [] moveLeft = {-1,0};
	private static final int [] moveRight = {1,0};
	private static final int [] moveUp = {0,-1};
	private static final int [] moveDown = {0,1}; 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [][] array = {
				
				{'#','#','#','#','#','#','#','#','#','#','#','#'},
				{'#','.','.','.','#','.','.','.','.','.','.','#'},
				{'.','.','#','.','#','.','#','#','#','#','.','#'},
				{'#','#','#','.','#','.','.','.','.','#','.','#'},
				{'#','.','.','.','.','#','#','#','.','#','.','#'},
				{'#','#','#','#','.','#','.','#','.','#','.','#'},
				{'#','.','.','#','.','#','.','#','.','#','.','#'},
				{'#','#','.','#','.','#','.','#','.','#','.','#'},
				{'#','.','.','.','.','.','.','.','.','#','.','#'},
				{'#','#','#','#','#','#','#','#','#','#','.','#'},
				{'e','.','.','.','.','.','.','.','.','.','.','#'},
				{'#','#','#','#','#','#','#','#','#','#','#','#'}			
				
		};
		int [] position = {2,0};
		
		if(mazeTraverse(array,position)){
			System.out.println("EXIT FOUND!");
		}else {
			System.out.println("NO EXIT!");		array = markCurrentPosition(array, position);
			printMaze(array);
			System.out.println();
		}
		
	}
	
	public static boolean mazeTraverse(char [][] array, int [] position){
		boolean result = false;
		int [] newPosition; 

		if(exitFound(array,position)){
			
			result = true;
			return result;
		}else{
			array = markCurrentPosition(array, position);
			printMaze(array);
			System.out.println();
			newPosition = findNewPosition(array,position);
			result = mazeTraverse(array,newPosition);
		}
		

		return result;
		
	}

	
	public static int [] findNewPosition(char [][]array, int []currentPosition){
		
		int [] result = null;
		int [] temp;
		
		temp = searchExit(array,currentPosition);
		if(eFound){
			result = temp;
			eFound = false;
			return result;
			
		}
		temp = searchEmpty(array,currentPosition);
		if(emptyCellFound){
			result = temp;
			emptyCellFound = false;
			return result;
		}
		temp = backTrack(array, currentPosition);
		
		result = temp;
		
		return result;
		
	}

	public static int [] backTrack(char [][] array, int [] position){
		int [] currentPosition = position;
		int [] newPosition = currentPosition; 
	 		
		newPosition = movePosition(currentPosition,moveUp);
		if(newPosition[0] >=0 && newPosition[0]<=11 && newPosition[1] >= 0 && newPosition[1] <= 11){
			if(array[newPosition[0]][newPosition[1]] == 'X'){
				return newPosition;
			}
		}
		
		newPosition = movePosition(currentPosition,moveLeft);
		if(newPosition[0] >=0 && newPosition[0]<=11 && newPosition[1] >= 0 && newPosition[1] <= 11){
			if(array[newPosition[0]][newPosition[1]] == 'X'){
				return newPosition;
			}
		}
	
		newPosition = movePosition(currentPosition,moveRight);
		if(newPosition[0] >=0 && newPosition[0]<=11 && newPosition[1] >= 0 && newPosition[1] <= 11){
			if(array[newPosition[0]][newPosition[1]] == 'X'){
				return newPosition;
			}
		}
	
		newPosition = movePosition(currentPosition,moveDown);
		if(newPosition[0] >=0 && newPosition[0]<=11 && newPosition[1] >= 0 && newPosition[1] <= 11){
			if(array[newPosition[0]][newPosition[1]] == 'X'){
				return newPosition;
			}
		}
	
		
		return newPosition;
	}
	
	public static int [] searchEmpty(char [][]array, int [] position){
		int [] result = null;
		
		result = movePosition(position,moveDown);
		if(result[0] >=0 && result[0]<=11 && result[1] >= 0 && result[1] <= 11){
			if(array[result[0]][result[1]] == '.'){
				emptyCellFound = true;
				return result;
			}
		}
	
		result = movePosition(position,moveRight);
		if(result[0] >=0 && result[0]<=11 && result[1] >= 0 && result[1] <= 11){
			if(array[result[0]][result[1]] == '.'){
				emptyCellFound = true;
				return result;
			}
		}
		
		
		result = movePosition(position,moveLeft);
		if(result[0] >=0 && result[0]<=11 && result[1] >= 0 && result[1] <= 11){
			if(array[result[0]][result[1]] == '.'){
				emptyCellFound = true;
				return result;
			}
		}
	
		result = movePosition(position,moveUp);
		if(result[0] >=0 && result[0]<=11 && result[1] >= 0 && result[1] <= 11){
			if(array[result[0]][result[1]] == '.'){
				emptyCellFound = true;
				return result;
			}
		}
	
		return result;
	}
	
	public static int [] searchExit(char [][] array, int [] position){
		int [] result = null;

		result = movePosition(position,moveUp);
		if(result[0] >=0 && result[0]<=11 && result[1] >= 0 && result[1] <= 11){
			if(array[result[0]][result[1]] == 'e'){
				eFound = true;
				return result;
			}
		}
		
		result = movePosition(position,moveRight);
		if(result[0] >=0 && result[0]<=11 && result[1] >= 0 && result[1] <= 11){
			if(array[result[0]][result[1]] == 'e'){
				eFound = true;
				return result;
			}
		}
		
		
		result = movePosition(position,moveLeft);
		if(result[0] >=0 && result[0]<=11 && result[1] >= 0 && result[1] <= 11){
			if(array[result[0]][result[1]] == 'e'){
				eFound = true;
				return result;
			}
		}
	
		result = movePosition(position,moveDown);
		if(result[0] >=0 && result[0]<=11 && result[1] >= 0 && result[1] <= 11){
			if(array[result[0]][result[1]] == 'e'){
				eFound = true;
				return result;
			}
		}
	
		
		return result;
		
	}
	
	public static int [] movePosition(int [] position, int [] moveDirection){
		int [] result = {0,0};
		result[0] = position[0] + moveDirection[0];
		result[1] = position[1] + moveDirection[1];
		return result;
	}
	
	public static char [][] markCurrentPosition(char [][]array, int [] position){
		char [][] result = array;
		result[position[0]][position[1]] = 'X';
		return result;
	}
	
	public static boolean exitFound(char [][] array, int [] position){
		boolean result = false;
		
		if(array[position[0]][position[1]] == 'e'){
			result = true;
		}
		
		return result;
	}


	public static void printMaze(char [][] array){
		
		for(int i = 0; i< array.length;i++){
			for(int j=0; j<array[i].length;j++){
				System.out.printf(" %c ", array[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
