package application;

import boardgame.Position;

public class Program {
	public static void main(String[] args) {
		System.out.println("Welcome chess game");
		Position pos = new Position(3,5);
		System.out.println("Position: " + pos.toString());
	}

}
