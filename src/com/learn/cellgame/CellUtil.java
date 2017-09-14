package com.learn.cellgame;

public class CellUtil {
	 Cell[] cells;
	
	
	 public CellUtil() {
		cells=new Cell[4];
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
