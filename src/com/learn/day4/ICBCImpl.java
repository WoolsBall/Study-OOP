package com.learn.day4;

public class ICBCImpl implements ICBC {
	private double money;
	private String pwd;

	public ICBCImpl(double money, String pwd) {
		super();
		this.money = money;
		this.pwd = pwd;
	}

	@Override
	public double getBalance() {
		
		return money;
	}

	@Override
	public boolean drawMoney(double numble) {
		if(numble<=money){
			money-=numble;
			return true;
		}
		return false;
	}

	@Override
	public boolean checkPwd(String input) {
		if(pwd.equals(input)){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public void payOnline(double number) {
		if(number<money){
			money-=number;
		}
		
	}

}
