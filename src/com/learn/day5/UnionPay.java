package com.learn.day5;

public interface UnionPay {

	/**
	 * 查看余额
	 */
	public double getBalance();

	/**
	 * 取钱
	 */
	public boolean drawMoney(double money);

	/**
	 * 检查密码
	 */
	public boolean checkPwd(String input);
}
