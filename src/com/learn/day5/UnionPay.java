package com.learn.day5;

public interface UnionPay {

	/**
	 * �鿴���
	 */
	public double getBalance();

	/**
	 * ȡǮ
	 */
	public boolean drawMoney(double money);

	/**
	 * �������
	 */
	public boolean checkPwd(String input);
}
