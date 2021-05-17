package oopCG;

import java.util.Scanner;

public class BMS {
	private String name;
	private int ac;
	private int bal;
	public BMS(String Name,int Acno, int bal) {
		this.name=Name;
		this.ac=Acno;
		this.bal=bal;
		
	}
	
	public void withdraw(int deduct) {
		bal-=deduct;
		System.out.println("DEDUCTED and balance is "+bal);
		
	}
	
	public void deposit(int add) {
		bal+=add;
		System.out.println("Deposited and bal is"+ bal);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BMS one =new BMS("Chandru",12,1000);
		//System.out.println(one.ac + one.name + one.bal);
		System.out.println("Balance is " + one.bal);
		System.out.println("Enter Withdrawl amt");
		int d=sc.nextInt();
		one.withdraw(d);
		System.out.println("Balance is " + one.bal);
		BMS two=new BMS("TEJA",13,2000);
		System.out.println(one.bal);
		System.out.println(two.bal);
		one.deposit(500);
		System.out.println(one.bal);
	}

}
