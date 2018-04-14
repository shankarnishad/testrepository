package String1;

import java.util.Scanner;

public class string_demo4 {
	
	public static void main() {
	
	String temp="";
	int p = 0;
	System.out.println("enter number");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	for(int i=0;i<s.length();i++){
		
		if (s.charAt(i)==' '){
			System.out.println(s.charAt(p)+".");
			temp="";
			p=i+1;
		}
		else{
			temp = temp+s.charAt(i);
			
		}
	}
	System.out.println(temp);
		
		
	}

}
