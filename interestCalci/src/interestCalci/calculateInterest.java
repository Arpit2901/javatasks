package interestCalci;
 

public class calculateInterest {
	private int age,in;
	private double r,t;
	private int p;
	private char gender;

	

	public calculateInterest( int p,int r, int t,  int in,int age, char gender) {
		super();
		this.r = r;
		this.t = t;
		this.age = age;
		this.in = in;
		this.p = p;
		this.gender = gender;
	}

	public void check() {
		//increase rate on the basis of age
		if(this.age>60) {
		this.age+=1;
		}
		//increase rate on the basis of gender
		if(this.gender=='f') {
			this.r+=0.5;
		}
		//increase rate on the basis of timeperiod
		if(this.t>1&&t<=3) {
			this.t+=0.5;
		}else if(this.t>3&&this.t<=5) {
			this.t+=1;
		}else if(this.t>5){
			this.t+=1.5;
		}
		if(this.in==1) {
			calSI();
		}else if(this.in==2) {
			calCI();
		}else {
			System.out.println("wrong choice");
		}
	}
	public void calSI() {
		double a=(this.p*this.r*this.t)/100;
		
		System.out.print("Simple interest calculated="+(a));
		a=a+p;
		System.out.print("and amount="+(a));
	}
	public void calCI() {
	
		double a=p * Math.pow(1 + (r /100),  t);
		System.out.print("compound interest calculated="+(a-p)+"and amount="+(a));
	}

}
