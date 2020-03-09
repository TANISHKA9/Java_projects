	package forNameMethodDemo;
	
	public class MainClass {
	
		    public static void main(String[] args) throws Exception {
		        Class.forName("forNameMethodDemo.DemoClass");
		        Class.forName("forNameMethodDemo.DemoClass");
		        Class.forName("forNameMethodDemo.DemoClass");
		        DemoClass demoClass = (DemoClass)Class.forName("forNameMethodDemo.DemoClass").newInstance();
		    }
	}
	
