package exams;
import java.util.Scanner;
public class Exam1 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x : ");
		int x = input.nextInt();
		System.out.println("y = " + CompY(x));
		System.out.println("z = " + CompZ(x));
		
		
		

	}
	
	static int CompY(int x){
		int y = x*x + 2*x + 1;
		return y;
	}
	
	static int CompZ(int x){
		int y=CompY(x);
		int z = (y-1)*(y-1) + (y-2)*(y-2);
		return z ;
		
	}

}

// NO IDEA FOR GUI QUESTION.
