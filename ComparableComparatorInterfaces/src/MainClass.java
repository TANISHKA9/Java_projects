import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		ReadyMadeGarments rmg1 = new ReadyMadeGarments(3, "Shirt", 200);
		ReadyMadeGarments rmg2 = new ReadyMadeGarments(2, "Sarees", 1000);
		ReadyMadeGarments rmg3 = new ReadyMadeGarments(4, "Frock", 100);
		ReadyMadeGarments rmg4 = new ReadyMadeGarments(1, "Top", 300);

		List<ReadyMadeGarments> clothsList = new ArrayList<>();
		clothsList.add(rmg1);
		clothsList.add(rmg2);
		clothsList.add(rmg3);
		clothsList.add(rmg4);
		
		
		//Comparable Interfaces based sorting:(Default way of sorting as per implementation)
		System.out.println("Sorted elements by their ClothId: ");
		Collections.sort(clothsList);
		for(ReadyMadeGarments r: clothsList)
		{
			System.out.println(r);
		}
		System.out.println();
		
		
		//Sort using Comparator class with reference of Price:
		System.out.println("Sorted elements by their price:");

		Comparator<ReadyMadeGarments> com = (o1, o2) -> ((o1.getPrice()>o2.getPrice())? 1 : ((o1.getPrice() < o2.getPrice())? -1 : 0));
		Collections.sort(clothsList, com);
		for(ReadyMadeGarments r: clothsList)
		{
			System.out.println(r);
		}
	}

}
