package dama;

import boardgame.Position;

public class DamaPosition {
	private char column;
	private int row;
	
	public DamaPosition(char column, int row) {
		this.column = column;
		this.row = row;
	}
	
	public int getRow() {
		return row;
	}
	public char getColumn() {
		return column;
	}
	
	public Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	public DamaPosition fromPosition(Position position) {
		 return new DamaPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	public String toString() {
		return "" + column
				+ row;
	}
}
