package application;

import boardgame.Board;
import chess.ChessMatch;

public class Program {
	public static void main(String[] args) {
		System.out.println("####   Welcome to chess game #####");
		System.out.println();
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	
	}
	

}
