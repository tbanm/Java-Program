package project_java;
import java.util.*; 

public class valuesAdd_list {
	 
	
	 public static void main(String args[]){  
	 List<Integer> list=new ArrayList<Integer>(); 
	  list.add(20);  
	  list.add(35);    
	  list.add(70);    
	  list.add(55); 
	 
	  System.out.println(list);
	  
	   List<Integer> l2=new ArrayList<Integer>(); 
	  l2.add(27);  
	  l2.add(85);    
	  l2.add(45);    
	  l2.add(76);
	  l2.add(89);
	 List<Integer> list3=new ArrayList<Integer>(); 
	  list3.addAll(l2);
	  int n=list3.size()/2;
	  System.out.println("The middle vale of list3 is:" + list3.get(n));
	    
	 for(Integer value:list3)  
	  
	    System.out.println(value);  
	    for(int i=n;i<list3.size();i++)
	    System.out.println(list3.get(i));
	  
	 }  
	}


