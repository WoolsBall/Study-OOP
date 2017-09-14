package com.learn.cellgame;

public class CellGame {
	public static void main(String[] args) {
		/*
		Cell cell=new Cell(5,8);
		cell.drop();
		printCell(cell);
		T t1=new T(1,2);
		t1.print();
		t1.moveRight();
        System.out.println("调用moveRight方法后的坐标：");
        t1.print();
        */
		
		System.out.println("--------打印T型---------");
		CellUtil t=new TetrominoT(1,4);
		t.print();
		printCell(t);
		
		System.out.println("--------打印J型---------");
		CellUtil j=new TetrominoJ(3,8);
		j.print();
		printCell(j);
		
	}
	
	public static void printCell(Cell cell){
		int totalcol = 10;
		int totalrow = 20;
		for (int row = 1; row < totalrow; row++) { 
			for (int col = 1; col < totalcol; col++) {
				if(row==cell.getRow()&&col==cell.getCol()){
					System.out.print("*");
				}else{
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void printCell(CellUtil cellutil){
		int totalcol = 10;
		int totalrow = 20;
		//获取方块中存储的四个格子的数组
		Cell[] cells=cellutil.cells;
		for (int row = 0; row < totalrow; row++) {
			for (int col = 0; col < totalcol; col++) {
				//用于判断该位置是否包含在cells数组中
				boolean isInCells=false;
				for (int i = 0; i < cells.length; i++) {
					if(row==cells[i].getRow()&&col==cells[i].getCol()){
						 System.out.print("* ");
	                        isInCells = true;
	                        break;
					}
				}
				if(!isInCells){
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}
}
