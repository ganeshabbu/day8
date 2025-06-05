package day8;
import java.util.*;
public class BinarySearchArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = {"Amit","Divya","Karan","Priya","Zoya"};
		String target = sc.nextLine();
		boolean found = false;
		int left = 0;
		int right = names.length;
		while(left<=right) {
			int mid = (left+right)/2;
			if(names[mid].equals(target)) {
				System.out.println("The target is found");
				found = true;
				break;
			}
			else if(names[mid].compareTo(target) < 0) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		if(!found) {
			System.out.println("The target is not found in the array");
		}
		sc.close();
	}

}
