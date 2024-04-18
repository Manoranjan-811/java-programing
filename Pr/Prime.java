package Pr;

import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
	int n;
	int temp=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			temp++;
		}
	}
	if(temp==2) {
		System.out.println("number is prime:"+n);
	}
	else {
		System.out.println("number is not prime:"+n);
	}
	
	}
}
