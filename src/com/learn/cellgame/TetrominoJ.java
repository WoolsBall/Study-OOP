package com.learn.cellgame;

public class TetrominoJ extends CellUtil{

	public TetrominoJ(int row,int col){
		super();
		 // ��˳ʱ�뷽���ʼ��Cell
		cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col + 1);
        cells[2] = new Cell(row, col + 2);
        cells[3] = new Cell(row + 1, col + 2);
	}

	@Override
	public void print() {
		System.out.println("i am a J");
		super.print();
	}
	
	
}
