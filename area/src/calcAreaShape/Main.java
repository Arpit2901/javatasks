package calcAreaShape;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length breadth and radius");
		int l,b;
		double r;
		l=sc.nextInt();
		b=sc.nextInt();
		r=sc.nextDouble();
		System.out.println(shapeArea.area());
		shapeArea obj= new shapeArea(l,b,b,r);
		obj.setR(2.0);
//		System.out.println(obj.getR());
		
		System.out.println(obj.sarea());
		System.out.println(obj.darea());

}
}
