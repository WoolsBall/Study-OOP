package com.learn.day4;

import java.util.Scanner;

public class TestUnionPay {

	public static void main(String[] args) {
		UnionPay icbc=new ICBCImpl(2000,"123456");
		Scanner input=new Scanner(System.in );
		System.out.println("请输入密码");
		if (icbc.checkPwd(input.next())) {
			System.out.println("请输入金额：");
			double num=Double.parseDouble(input.next());
			if(icbc.drawMoney(num)){
				System.out.println("取钱成功，卡余额为： "+icbc.getBalance());
			}else{
				System.out.println("取钱失败！");
			}
		}else{
			System.out.println("密码错位");
		}
		input.close();
	}
}
