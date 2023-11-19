package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		this.board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	private void placeNewPiece(int row, int column, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition('a', 2).toPosition());
	}
	
	public void initialSetup() {
		placeNewPiece(2, 1, new King(Color.BLACK, board));
		
	}
}
