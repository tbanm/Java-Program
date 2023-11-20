package project_java;
import java.util.ArrayList;
import java.util.Iterator;

public class itaretorArraylist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Arraya");
		list.add("Addi");
		list.add("Suriya");
		list.add("Prsbhssh");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Name of the arraylit is: " + list);
		System.out.println(list.get(2));
		list.set(3, "RamCharan");
		/*
		 for(String n : list){
		 System.out.println(n);
		 }
		 */
         Iterator itr1 = list.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
