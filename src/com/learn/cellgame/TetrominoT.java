package com.learn.cellgame;

public class TetrominoT extends CellUtil {

	public TetrominoT(int row,int col){
		super();
		cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col + 1);
        cells[2] = new Cell(row, col + 2);
        cells[3] = new Cell(row + 1, col + 1);
	}

	@Override
	public void print() {
		System.out.println("i am a T");
		super.print();
	}
	
	
}
