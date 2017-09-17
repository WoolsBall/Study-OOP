package com.learn.cellgame;

public class T {

	Cell[] cells;
	
	 /**
     * ���췽����Ϊ����cells���г�ʼ��
     */
    public T() {
        this(0, 0);
    }
    
	/**
     * ���췽����Ϊ����cells���г�ʼ��
     * 
     * @param row˳ʱ�뷽��
     *            ����һ���������
     * @param col˳ʱ�뷽��
     *            ����һ���������
     */
    public T(int row, int col) {
        cells = new Cell[4];
        // ��˳ʱ�뷽���ʼ��Cell
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col + 1);
        cells[2] = new Cell(row, col + 2);
        cells[3] = new Cell(row + 1, col + 1);
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
