package com.learn.day1;

public class Emp {
	private String name;
	private int age;
	private String sex;
	private double salay;
	
	public Emp(){
		
	}
	
	public Emp(String name, int age, String sex, double salay) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salay = salay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getSalay() {
		return salay;
	}

	public void setSalay(double salay) {
		this.salay = salay;
	}
	
	
	//��ӡ����
	public void printInfo() {
		System.out.println("--------------------");
		
		System.out.println("������ " + name);
		System.out.println("���䣺" + age);
		System.out.println("�Ա�" +sex);
		System.out.println("нˮ��" + salay);
	}

}
