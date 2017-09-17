package com.learn.day5;

public class ABCImpl implements ABC {

	/**�������������͸֧2000*/
	private double balance;
	/**�˺�����*/
	private String password;
	
	public ABCImpl(double balance, String password) {
		super();
		this.balance = balance;
		this.password = password;
	}

	@Override
	public double getBalance() {
		
		return balance;
	}

	@Override
	public boolean drawMoney(double money) {
		if(balance<=money){
			balance-=money;
			return true;
		}
		return false;
	}

	@Override
	public boolean checkPwd(String input) {
		if(password.equals(input)){
			return true;
		}else{
		return false;
		}
	}

	@Override
	public boolean payTelBill(String phoneNum, double sum) {
		if(phoneNum.length()==11&&(balance-sum)>-2000){
			balance-=sum;
			return true;
		}
		return false;
	}

}
