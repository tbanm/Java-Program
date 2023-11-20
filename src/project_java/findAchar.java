package project_java;
import java.util.*;

public class findAchar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = sc.nextLine();
		char[] nameArray =new char[name.length()];
		for(int i=0;i<name.length();i++) {
			nameArray[i]=name.charAt(i);
		}
		int count = 0;
		for(char c : nameArray) {
			if(c == 'a') {
				count++;
			}
		}
		System.out.println("\n"+count);

	}

}
