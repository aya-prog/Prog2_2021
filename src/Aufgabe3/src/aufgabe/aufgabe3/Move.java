package aufgabe.aufgabe3;

public class Move {
	
	
	private Point from; 
	private Point to; 

	
	
	public Move(int fromRow, int fromCol, int toRow, int toCol) {
		
		this.from = new Point (fromCol, fromRow);
		this.to = new Point (toRow, toCol); 
		
	}
	
	
	public Move(Point from, Point to) {
		
		this.from = new Point(from.getRow(), from.getCol());
		this.to = new Point(to.getRow(), to.getCol());
		
	}
	
	public Point getFrom() {
		
		return new Point(this.from.getRow(), this.from.getCol());
		
	}
	
	public Point getTo() {
		
		return new Point(this.to.getRow(), this.to.getCol());
		
	}
}
