package exams;

public class Exam2 {

	
	public static void main(String[] args) {
		
		cylinder test = new cylinder(2,3);
		test.printCylinder();
		test.ExtraSize();
	}	

}

class circle {
	private double r;
	
	circle(){r=0;}
	circle(double inserted_r){r=inserted_r;}
	void printCircle(){
		System.out.print("R = " + r);
		System.out.print("Circle Area = " + circleArea());}
	
	double circleArea(){return r*3.14 ;}
	double getRadius(){return r;}
	
	}

class cone extends circle{
	private double height;
	cone(){super();height=0;}
	cone(double inserted_r,double inserted_height){
		super(inserted_r);
		height=inserted_height;}
	void PrintCone(){
		System.out.println("Height = " + height);
		System.out.println("Radius = " + super.getRadius());
		System.out.println("Circle Area = " + circleArea());
		System.out.println("Cone size = " + coneSize());}
	double coneSize(){return (0.3*super.circleArea()*height);}
	double getHeight(){return height;}
	}

class cylinder extends cone {
	cylinder(){super();}
	cylinder(double inserted_r,double inserted_height){super(inserted_r,inserted_height);}
	double cylinderSize() {return (2*super.getHeight()*super.circleArea() );}
	void printCylinder(){
		super.PrintCone();
		System.out.println("Cylinder size = " + cylinderSize());
	}
	void ExtraSize(){System.out.println("Extra Size = " + (cylinderSize() - 2*super.coneSize()) ) ; }
	}

	

