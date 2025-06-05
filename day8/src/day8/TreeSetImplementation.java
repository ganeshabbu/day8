package day8;

import java.util.TreeSet;


public class TreeSetImplementation {

	public static void main(String[] args) {
	   TreeSet<Integer> s = new TreeSet<Integer>();
	   s.add(5002);
	   s.add(4998);
	   s.add(5005);
	   s.add(4999);
	   s.add(5001);
	   System.out.println("The First Book Id is :"+s.first());
	   System.out.println("The Last Book Id is :"+s.last());
	   System.out.println("The ids greater than 5005:");
	   for(int id:s) {
		   if(id > 4999) {
			   System.out.println(id);
		   }
	   }
	   System.out.println("The ids lower than 5005:");
	   for(int id:s) {
		   if(id < 5005) {
			   System.out.println(id);
		   }
	   }
	}

}
