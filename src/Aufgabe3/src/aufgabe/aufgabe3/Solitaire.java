package aufgabe.aufgabe3;

public class Solitaire {
	
	private Moves game;
	private State field[][];
	
	public Solitaire() {
		
		this.game = new Moves();
		this.field = new State[7][7];
		for(int row = 0; row < this.field.length; row++) {
			
			for(int col = 0; col < this.field[row].length; col++) {
				
				if((row < 2 || row > 4) && (col < 2 || col > 4))
				{
					this.field[row][col] = State.NOT; 			
					
				}
				else
				{
					this.field[row][col] = State.USED; 
				}
				
				
			}
			
		}
		
		this.field[3][3] = State.FREE;
		
	}
	
	public void print() {
		
		for(int row = 0; row < this.field.length; row++) {
			
			for(int col = 0; col < this.field[row].length; col++) {
				
				if(this.field[row][col] == State.USED) 
					System.out.print("o");
				else
				{
					if(this.field[row][col] == State.NOT)
						System.out.println("x");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	
	
	
	public boolean possibleFrom(int row, int col) {
		
		if(row > 1 && this.field[row-1][col] == State.USED && this.field[row-2][col] == State.FREE) return true;
		if(row < 5 && this.field[row+1][col] == State.USED && this.field[row+2][col] == State.FREE) return true;
		if(col < 5 && this.field[row][col+1] == State.USED && this.field[row][col+2] == State.FREE) return true;
		if(col > 1 && this.field[row][col-1] == State.USED && this.field[row][col-2] == State.FREE) return true;
		return false; 
	
	}
	
	public Point[] possibleTo(int fromRow, int fromCol)
	{
		int nrOfPossibleTos = 0;
		if(!possibleFrom(fromRow, fromCol)) return new Point[nrOfPossibleTos];
		
		boolean up = fromRow > 1 && this.field[fromRow-1][fromCol] == State.USED && this.field[fromRow-2][fromCol] == State.FREE;
	    boolean down=fromRow < 5 && this.field[fromRow+1][fromCol] == State.USED && this.field[fromRow+2][fromCol] == State.FREE;
	    boolean right=fromCol < 5 && this.field[fromRow][fromCol+1] == State.USED && this.field[fromRow][fromCol+2] == State.FREE;
	    boolean left=fromCol > 1 && this.field[fromRow][fromCol-1] == State.USED && this.field[fromRow][fromCol-2] == State.FREE;
		
		if(up) nrOfPossibleTos++;
		if(down) nrOfPossibleTos++;
		if(right) nrOfPossibleTos++;
		if(left) nrOfPossibleTos++;
		
		Point[] tos = new Point[nrOfPossibleTos];
		int index = 0;
		if(up) tos[index++] = new Point(fromRow-2, fromCol);
		if(down) tos[index++] = new Point(fromRow+2, fromCol);
		if(right) tos[index++] = new Point(fromRow, fromCol+2);
		if(left) tos[index] = new Point(fromRow, fromCol-2);
		
		return tos;
	}
		






public Moves possibleMoves() {
	
	Moves possibleMoves = new Moves();
	for(int row = 0; row < this.field.length; row++)
	{
		for(int col = 0; col < this.field[row].length; col++)
		{
			if(possibleFrom(row,col))
			{
				Point from = new Point(row,col);
				Point[] tos = this.possibleTo(row, col);
				for(int index=0; index<tos.length; index++)
				{
					Move move=new Move(from, tos[index]);
					possibleMoves.addMove(move);
				}
			}
		}
	}
	return possibleMoves;

}

public boolean movePossible()
{
	for(int row = 0; row < this.field.length; row++)
	{
		for(int col = 0; col < this.field[row].length; col++)
		{
			if(possibleFrom(row,col)) return true;
		}
	}
	return false;



}



public void move(Move move) throws IllegalArgumentException
{

	int middleRow = (move.getFrom().getRow() + move.getTo().getRow()) / 2;
	int middleCol = ( move.getFrom().getCol() + move.getTo().getCol()) / 2;
	try {
		this.field[move.getFrom().getRow()][move.getFrom().getCol()] = State.FREE;
		this.field[middleRow][middleCol] = State.FREE;
		this.field[move.getTo().getRow()][move.getTo().getCol()] = State.USED;	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		throw new IllegalArgumentException("Move is not possible(" + move.getFrom().getRow() + ", " + move.getFrom().getCol() + ") --> "
				+ "( " + move.getTo().getRow() + ", " + move.getTo().getCol() + ") ");

	}
}
	
	public boolean moveFirstPossible()
	{
		System.out.println("Make the first possible move from the following list of possible ones:");
		if(!movePossible()) return false;
		else {
			Moves possibleMoves = this.possibleMoves();
			possibleMoves.printMoves();
			Move move = possibleMoves.getMoveAtIndex(0);
			this.move(move);
			return true;
		}


}
	
}
