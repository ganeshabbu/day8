package day8;

import java.util.*;

public class TreeSetSearch {

	public static void main(String[] args) {
		TreeSet<String> components = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		components.add("keyboard");
		components.add("mouse");
		components.add("memory");
		components.add("Monitor");
		components.add("webcam");
		String s = sc.nextLine().toLowerCase();
		if(components.contains(s)) {
			System.out.println("product exists");
		}
		else {
			System.out.println("Prduct doesn't exists");
		}
		sc.close();
	}

}
