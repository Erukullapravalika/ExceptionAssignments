package com.assignment.two;
import java.util.Scanner;

public class CustomerTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Customer cust=null;
		System.out.println("Enter CustNo:");
		String custNo=sc.nextLine();
		System.out.println("Enter CustomerName:");
		String custName=sc.nextLine();
		System.out.println("Enter category:");
		String category=sc.nextLine();
		try {
			cust=new Customer(custNo,custName,category);
		}catch(InvalidInputException e) {
			System.out.println(e);
		}
		
	}
	

}
