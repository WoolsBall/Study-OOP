package com.learn.day5;

public class TestAYTM {

	public static void main(String[] args) {
		ABCATM atm=new ABCATM();
		ABCImpl abc=new ABCImpl(2000,"123456");
		
		atm.insertCart(abc);
		atm.allMenu();
	}
}
