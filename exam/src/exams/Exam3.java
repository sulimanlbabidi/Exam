package exams;

public class Exam3 {

	public static void main(String[] args) {
		Box box = new Box(4,3);
		box.compLength();
		Triangle triangle = new Triangle(5,6);
		triangle.compLength();
		Circle1 circle = new Circle1(7);
		circle.compLength();
		Box1 box1 = new Box1(9);
		box1.compLength();

	}

}

interface Length {
	void compLength();
}

class Box implements Length{
	private double L;
	private double H;
	Box(double l,double h){L=l;H=h;}
	public void compLength(){
		double peri=(L+H)*2;
		System.out.println("Box perimeter = " + peri);
	}
	public double getL(){return L;}
	public double getH(){return H;}
}

class Triangle extends Box implements Length{
	Triangle(double l,double h){super(l,h);}
	public void compLength(){
		double peri=getL() + 2*getH();
		System.out.println("Triangle perimeter = " + peri);
	}
}

class Circle1 implements Length {
	
	private double r;
	public void compLength() {
		double peri = 2*Math.PI*r; 
		System.out.println("Circle perimeter = " + peri);
	}
	Circle1(double R){r=R;}
	public double getR(){return r;}
}

class Box1 extends Circle1 implements Length{
	public void compLength(){
		double peri = 4*getR();
		System.out.println("Box1 perimeter = " + peri);
	}
	Box1(double R){super(R);}
}