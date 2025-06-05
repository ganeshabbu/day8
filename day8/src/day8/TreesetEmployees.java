package day8;

import java.util.TreeSet;

public class TreesetEmployees {

	public static void main(String[] args) {
		TreeSet<String> employees = new TreeSet<String>();
		employees.add("Sumit");
		employees.add("Karan");
		employees.add("Anjali");
		employees.add("Mohan");
		employees.add("Zoya");
		System.out.println("the reverse order is:"+employees.reversed());

	}

}
