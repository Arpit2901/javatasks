package calcAreaShape;

public class shapeArea {
	private int l;
	private int b;
	private int s;
	private double r;
	
	
	public shapeArea(int l, int b, int s, double r) {
		super();
		this.l = l;
		this.b = b;
		this.s = s;
		this.r = r;
	}
	public static int area() {
		return 45;
//		System.out.println("th area of rectangle="+ l*b);
		
	}
	public int sarea() {
		return s*s;
//		System.out.println("th area of square="+ s*s);
	}
	public double darea() {
		return 3.141*r*r;
//		System.out.println("th area of circle="+3.141*r*r);
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}

}
