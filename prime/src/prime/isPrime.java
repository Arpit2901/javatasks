package prime;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		int i,z=0,j,n,ctr;
		System.out.print("enter the no.");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		if(n==1) {
			System.out.print("nth prime is 2");
		}
		for(j=3;j<100;j+=2) {
			ctr=0;
		for(i=2;i<j/2;i++) {
		if(j%i==0) {
		ctr++;
		}
		}
		if(ctr==0) {
			z++;
		}
		if(z+1==n) {
			System.out.print("nth prime"+j);
			break;
		}
		}
	}

}
