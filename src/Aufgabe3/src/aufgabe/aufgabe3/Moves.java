package aufgabe.aufgabe3;

public class Moves {
	
	
	private Move[] moveArray;
	
	public Moves() {
		
		this.moveArray = new Move[0];
		
	}
	
	public int getLength() {
		
		return this.moveArray.length; 
		
	}
	
	public void addMove(Move nextMove) {
		
		Move[] newMoves= new Move[this.moveArray.length +1];
		for(int index = 0; index < this.moveArray.length; index++) {
			newMoves[index] = this.moveArray[index]; 
		}
		
		newMoves[newMoves.length -1] = new Move(nextMove.getFrom(), nextMove.getTo()); 
		this.moveArray = newMoves; 
	}
	
	
	public Move getMoveAtIndex(int index) throws IllegalArgumentException {
		 
		try {
			return this.moveArray[index]; 
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			throw new IllegalArgumentException("kein gültiger Index!");
		}
	}
		
		public void printMoves() {
			
			System.out.printf("-----------------%n");
			for(int index = 0; index < this.moveArray.length; index++) {
				System.out.println(moveArray[index].getFrom().toString() + " -->" + moveArray[index].getTo().toString());
			}
			
			System.out.printf("-----------------%n");
			
		
		
	}
		
		
	
	

}
