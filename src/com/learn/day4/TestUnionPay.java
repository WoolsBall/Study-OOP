package com.learn.day4;

import java.util.Scanner;

public class TestUnionPay {

	public static void main(String[] args) {
		UnionPay icbc=new ICBCImpl(2000,"123456");
		Scanner input=new Scanner(System.in );
		System.out.println("����������");
		if (icbc.checkPwd(input.next())) {
			System.out.println("�������");
			double num=Double.parseDouble(input.next());
			if(icbc.drawMoney(num)){
				System.out.println("ȡǮ�ɹ��������Ϊ�� "+icbc.getBalance());
			}else{
				System.out.println("ȡǮʧ�ܣ�");
			}
		}else{
			System.out.println("�����λ");
		}
		input.close();
	}
}
