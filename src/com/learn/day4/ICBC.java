package com.learn.day4;

public interface ICBC extends UnionPay {
	/**增加的在线支付功能*/
    public void payOnline(double number);
}
