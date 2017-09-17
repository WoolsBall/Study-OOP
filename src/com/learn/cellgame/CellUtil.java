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
	     * ʹ�����½�һ������
	     */
	    public void drop(){
	    	for (int i = 0; i < cells.length; i++) {
				cells[i].setRow(cells[i].getRow()-1);
			}
	    }
	    
	    /**
	     * ʹ��������һ������
	     */
	    public void moveLeft() {
	        for (int i = 0; i < cells.length; i++) {
	            cells[i].setCol(cells[i].getCol()-1);
	        }
	    }
	    
	    /**
	     * ʹ��������һ������
	     */
	    public void moveRight() {
	        for (int i = 0; i < cells.length; i++) {
	            cells[i].setCol(cells[i].getCol()+1);;
	        }
	    }
}
