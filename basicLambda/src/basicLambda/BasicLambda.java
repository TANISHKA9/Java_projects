package basicLambda;

public class BasicLambda {

	public static void main(String[] args) {
		arithmatic add =(a, b)->a+b;
		System.out.println("Addition: " + add.operation(10,20)); 
		
		arithmatic sub =(a, b)->a-b;
		System.out.println("Subtraction: " + sub.operation(30, 10));
		
		arithmatic mul =(a, b)->a*b;
		System.out.println("Multiplication: " + mul.operation(3, 5));
	}
}

interface arithmatic
{
	int operation(int num1, int num2);
}
