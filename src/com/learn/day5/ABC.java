package com.learn.day5;

public interface ABC extends UnionPay {
	/**增加支付电话费的功能*/
    public boolean payTelBill(String phoneNum,double sum);
}
