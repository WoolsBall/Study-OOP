package com.learn.day4;

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
