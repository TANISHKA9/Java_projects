import java.util.HashMap;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		
//		String name1 = "priyanka";
//		String name2 = "priyanka";
//		System.out.println(name1 == name2);
//		System.out.println(name1.equals(name2));
		
		
//		String name1 = new String("priyanka");
//		String name2 = new String("priyanka");
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
//		System.out.println(name1 == name2);
//		System.out.println(name1.equals(name2));

				
		Employee e1 = new Employee(1, "priyanka");
		Employee e2 = new Employee(1, "priyanka");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());	
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));

		Map<Employee, Integer> map = new HashMap<Employee, Integer>();
		map.put(e1, 1);
		map.put(e2, 6);
		System.out.println(map.size());
		System.out.println(map.get(e1));

	}

}
