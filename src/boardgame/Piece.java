package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board, Position position) {
		this.board = board;
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Board getBoard() {
		return board;
	}
	
	
}
