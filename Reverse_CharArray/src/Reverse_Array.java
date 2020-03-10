public class Reverse_Array
{
    public static char[] reverseArray(char[] array) {
    	char[] output = new char[array.length];
    	int increament=-1;
        for(int i=array.length-1; i>=0; i--)
        {
        	output[++increament]=array[i];
        }
        return output;
    }
    
    public static char[] reverseArray2(char[] array) {
        for(int i=0; i<array.length/2; i++)
        {
        	array[i]^=array[array.length-i-1];
        	array[array.length-i-1]^=array[i];
        	array[i]^=array[array.length-i-1];
        }
        return array;
    }
    
    public static void main(String[] args) {
        char[] input = {'H','e','l','l','o'};
       // System.out.println(reverseArray(input));
        System.out.println(reverseArray2(input));
        char[] input2 = {'J','a','v','a'};
       // System.out.println(reverseArray(input));
        System.out.println(reverseArray2(input2));
    }
}           