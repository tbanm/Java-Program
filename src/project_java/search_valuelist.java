package project_java;
import java.util.ArrayList;
import java.util.List;

public class search_valuelist {
	public static void main(String[] args){
		List<Integer> value = new ArrayList<>();
		value.add(85);
		value.add(78);
		value.add(96);
		value.add(60);
		value.add(90);
		
		System.out.println("The first occurrence of 2 is at index"+value.indexOf(78));
		
		
		
		System.out.println("The last occurrence of 2 is at index: "+value.lastIndexOf(90));
		
		
      }

}
