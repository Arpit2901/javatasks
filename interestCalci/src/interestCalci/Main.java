package interestCalci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Age ANd Gender `m or f`of Depositor");
		int age=sc.nextInt();
		char gender=sc.next().charAt(0);
		System.out.println("Enter the principle,ROI,Duration");
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		System.out.println("Type of Interest \n`1-SI or 2-CI`");
		int in=sc.nextInt();
		
		calculateInterest obj=new calculateInterest(p,r,t,in,age,gender);
		obj.check();
				
	}

}
