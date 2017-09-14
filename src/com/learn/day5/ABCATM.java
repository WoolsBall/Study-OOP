package com.learn.day5;

import java.util.Scanner;

public class ABCATM {

	private UnionPay card;

	public void insertCart(UnionPay userCard) {
		if (card == null) {
			card = userCard;
		}
	}

	public void outsertCard() {
		card = null;
	}

	private void showBalance() {
		System.out.println("当前余额是：" + card.getBalance());
	}
	
	private void takeMoney(){
        Scanner input = new Scanner(System.in);        
        System.out.println("请输入取款数目：");
        double  number = Double.parseDouble(input.next());
        if(card.drawMoney(number)){
            System.out.println("取款成功");
        }else{
            System.out.println("取款失败");
        }
    }
	  private void payTelBill(){
	        Scanner input = new Scanner(System.in);    
	        if(card instanceof ABC){
	            ABC abcCard = (ABC)card;
	            System.out.println("请输入电话号码：");
	            String telNum = input.next();
	            System.out.println("请输入缴费额：");
	            double sum = Double.parseDouble(input.next());
	            if(abcCard.payTelBill(telNum,sum)){
	                System.out.println("缴费成功");
	            }else{
	                System.out.println("缴费失败");
	            }
	                
	                
	        }else{
	            System.out.println("您的卡不是农业银行卡，无法完成缴费");
	        }
	    }
	  public void allMenu(){
	        Scanner input = new Scanner(System.in);    
	        
	        System.out.println("请输入密码：");
	        String pwd = input.next();
	        
	        if(card.checkPwd(pwd)){
	            System.out.println("请选择功能：\n 1.查看余额   2.取款   3.缴电话费");
	            int choice = Integer.parseInt(input.next());
	            switch(choice){
	                case 1:
	                    showBalance();
	                    break;
	                case 2:
	                    takeMoney();
	                    break;
	                case 3:
	                    payTelBill();                    
	                    break;
	                default:
	                    System.out.println("非法输入");
	            }
	        }else{
	            System.out.print("密码错误");
	        }
	        this.outsertCard();
	    }
}
