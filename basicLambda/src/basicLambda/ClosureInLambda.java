package basicLambda;

public class ClosureInLambda {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		sampleFunction2(()->System.out.println(a+b));
	}

	private static void sampleFunction2(SampleInterface si)
	{
		si.sampleFunction1();
	}
}

interface SampleInterface
{
	void sampleFunction1();
}