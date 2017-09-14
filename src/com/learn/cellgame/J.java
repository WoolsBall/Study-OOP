package com.learn.cellgame;

public class J {
	Cell[] cells;
	
	 /**
    * 构造方法，为属性cells进行初始化
    */
   public J() {
       this(0, 0);
   }
   
	/**
    * 构造方法，为属性cells进行初始化
    * 
    * @param row顺时针方向
    *            ，第一个坐标的行
    * @param col顺时针方向
    *            ，第一个坐标的列
    */
   public J(int row, int col) {
	   cells = new Cell[4];
       // 按顺时针方向初始化Cell
       cells[0] = new Cell(row, col);
       cells[1] = new Cell(row, col + 1);
       cells[2] = new Cell(row, col + 2);
       cells[3] = new Cell(row + 1, col + 2);
   }
   
   public void print(){
   	String str="";
   	for (int i = 0; i <= cells.length-1; i++) {
   		str+= "(" + cells[i].getCellInfo() + "), ";
		}
   	//str += "(" + cells[cells.length - 1].getCellInfo() + ")";
   	System.out.println(str);
   }
   
   /**
    * 使方块下降一个格子
    */
   public void drop(){
   	for (int i = 0; i < cells.length; i++) {
			cells[i].setRow(cells[i].getRow()-1);
		}
   }
   
   /**
    * 使方块左移一个格子
    */
   public void moveLeft() {
       for (int i = 0; i < cells.length; i++) {
           cells[i].setCol(cells[i].getCol()-1);
       }
   }
   
   /**
    * 使方块右移一个格子
    */
   public void moveRight() {
       for (int i = 0; i < cells.length; i++) {
           cells[i].setCol(cells[i].getCol()+1);;
       }
   }
}
