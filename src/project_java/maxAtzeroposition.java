package project_java;
import java.util.*;

public class maxAtzeroposition {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,25};
		int index = 0;
		int max = a[0];
		for(int i = 0; i < a.length; i++)
		{
		    if(a[i] > max)
		    {
		         max = a[i];
		         index = i;
		    }
		}
		a[index] = a[0];
		a[0] = max;
		for(int i:a)
		System.out.print(i );

	}

}
