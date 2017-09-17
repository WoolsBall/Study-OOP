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
		System.out.println("��ǰ����ǣ�" + card.getBalance());
	}
	
	private void takeMoney(){
        Scanner input = new Scanner(System.in);        
        System.out.println("������ȡ����Ŀ��");
        double  number = Double.parseDouble(input.next());
        if(card.drawMoney(number)){
            System.out.println("ȡ��ɹ�");
        }else{
            System.out.println("ȡ��ʧ��");
        }
    }
	  private void payTelBill(){
	        Scanner input = new Scanner(System.in);    
	        if(card instanceof ABC){
	            ABC abcCard = (ABC)card;
	            System.out.println("������绰���룺");
	            String telNum = input.next();
	            System.out.println("������ɷѶ");
	            double sum = Double.parseDouble(input.next());
	            if(abcCard.payTelBill(telNum,sum)){
	                System.out.println("�ɷѳɹ�");
	            }else{
	                System.out.println("�ɷ�ʧ��");
	            }
	                
	                
	        }else{
	            System.out.println("���Ŀ�����ũҵ���п����޷���ɽɷ�");
	        }
	    }
	  public void allMenu(){
	        Scanner input = new Scanner(System.in);    
	        
	        System.out.println("���������룺");
	        String pwd = input.next();
	        
	        if(card.checkPwd(pwd)){
	            System.out.println("��ѡ���ܣ�\n 1.�鿴���   2.ȡ��   3.�ɵ绰��");
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
	                    System.out.println("�Ƿ�����");
	            }
	        }else{
	            System.out.print("�������");
	        }
	        this.outsertCard();
	    }
}
