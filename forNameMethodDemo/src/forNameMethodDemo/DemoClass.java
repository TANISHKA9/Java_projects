package forNameMethodDemo;

public class DemoClass {
	
	static
	{
		System.out.println("in Static block");
	}

	static 
	{
		System.out.println("in second static block");
	}
	
	{
		System.out.println("in Instance block");
	}
}
