package day8;
import java.util.TreeMap;

public class TreeMapSearch {

	public static void main(String[] args) {
		TreeMap<String, String> c = new TreeMap<String, String>();
		c.put("India", "New Delhi");
		c.put("USA", "Washington");
		c.put("Germany", "Berlin");
		c.put("Japan", "Tokyo");
		c.put("India", "Delhi"); 
		System.out.println("sorted order:"+c);
		System.out.println("The first key:"+c.firstKey());
		System.out.println("The last key:"+c.lastKey());
		System.out.println("The higher key:"+c.higherKey("India"));
		System.out.println("The Lower Key:"+c.lowerKey("India"));
		
	}

}
