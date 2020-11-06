package simple_if_statement;

public class Simple_if_statement {
	
	// Question 1
	public void question1(int a) {
		if (a>0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	
	// Question 2
	public void question2(int a) {
		if(a%2 != 0) {
			System.out.println("odd");
		}
		else {
			System.out.println("even");
		}
	}
	
	
	// Question 3
	public void question3(char a) {
		
		if(a <91 && a>64) {
		System.out.println("upper class");
		}
		else if(a >96 && a< 123){
		System.out.println("lower class");
		}
		else {
		System.out.println("neither");
		}
	}
	
	
	// Question 4
	public void question4(int a) {
		if(a%10 == 0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
			}
		
	}
	
	
	// Question 5
	public void question5(double a, double b, double c) {
		if(a>b) {
			if(a>c) {
				System.out.println("a");
			}
			else {
				System.out.println("c");
			}
		}
			else {
				if(b>c) {
					System.out.println("b");
				}
				else {
					System.out.println("c");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Simple_if_statement runner = new Simple_if_statement();
			runner.question1(0);
			runner.question2(0);
			runner.question3((char) 23);
			runner.question4(0);
			runner.question5(3,4,5);

	}
	
}
