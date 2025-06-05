package day8;

import java.util.*;

public class FriendsGraph {

	public static void main(String[] args) {
		Map<String, List<String>> graph = new HashMap<String, List<String>>();
		graph.put("Alice", Arrays.asList("bob"));
		graph.put("Bob",Arrays.asList("Alice","Charlie"));
		graph.put("Charlie", Arrays.asList("bob"));
		for(String person : graph.keySet()) {
			System.out.println(person+" is friends with "+graph.get(person));
		}
	}

}
