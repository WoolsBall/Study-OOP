package com.learn.cellgame;

public class Cell {

	private int col;
	private int row;
	
	public Cell(){
		
	}
	
	public Cell(Cell cell) {
		super();
		this.col=cell.col;
		this.row=cell.row;
	}

	public Cell(int col, int row) {
		super();
		this.col = col;
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	
	public void drop(){
		row++;
	}
	public void drop(int d){
		row+=d;
	}
	public void moveLeft(){
		col--;
	}
	public void moveLeft(int m){
		col-=m;
	}
	public String getCellInfo(){
		return col+","+row;
	}
}
