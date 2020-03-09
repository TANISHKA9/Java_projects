package basicLambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingUsingLambda {

	public static void main(String[] args) {
		int array[] = {10, 20, 30};
		int keyArray= 0;
		
		operation(array, keyArray, wrapperFunctionForException((a , k) ->System.out.println(a/k)));
		

	}
	
	private static BiConsumer<Integer, Integer> wrapperFunctionForException(BiConsumer<Integer, Integer> biconsumer)
	{
		return (a, k)->{
		try{ 
			biconsumer.accept(a, k); 
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic Exception is thrown " + e);
		}
		};
	}

	private static void operation(int[] array, int keyArray, BiConsumer<Integer, Integer> biConsumer) 
	{
		for(int a:array) {
		biConsumer.accept(a, keyArray);	
		}
	}


}
