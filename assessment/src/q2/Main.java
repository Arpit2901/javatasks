package q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	human obj=new human();
	obj.sleep();
	obj.bite();
	
//	polymorphism
	
	monkey m=new human();
//	m.eat();//humanfunction
	m.jump();
	}

}
