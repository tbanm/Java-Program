package project_java;
import java.util.*;

public class maxMinnumber {

 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int max, min;
        int arr[] = new int[5];
        System.out.println("Enter the numbers");
        for(int i=0; i<5; i++) {
        	arr[i] = sc.nextInt();
        }
        min = max= arr[0];
        for(int i=0;i<5;i++) {
        	if(arr[i] < min) {
        		min =arr[i];
        	}if(arr[i]>max) {
        		max=arr[i];
        	}
        }
       
      
        System.out.println("Minimum element is " + min);
        System.out.println("Maximum element is " + max);
    }
}
