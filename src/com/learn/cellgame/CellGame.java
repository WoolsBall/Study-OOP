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
        System.out.println("����moveRight����������꣺");
        t1.print();
        */
		
		System.out.println("--------��ӡT��---------");
		CellUtil t=new TetrominoT(1,4);
		t.print();
		printCell(t);
		
		System.out.println("--------��ӡJ��---------");
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
		//��ȡ�����д洢���ĸ����ӵ�����
		Cell[] cells=cellutil.cells;
		for (int row = 0; row < totalrow; row++) {
			for (int col = 0; col < totalcol; col++) {
				//�����жϸ�λ���Ƿ������cells������
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
