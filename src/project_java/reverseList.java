package project_java;
import java.util.*;

public class reverseList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(94);
		list.add(87);
		list.add(43);
		list.add(45);
		list.add(97);
		for(Integer value : list) {
			System.out.println( value);
		}
		System.out.println("The reverse list is.........");
		
		for(int i=0, j=list.size()-1;i<j;i++) {
			list.add(i, list.remove(j));
		}
		System.out.println(list);

	}

}
