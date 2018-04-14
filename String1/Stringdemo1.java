package String1;

import java.util.Scanner;

public class Stringdemo1  {
    public static void main(String args[]) {
    /*  Scanner sc = new Scanner(System.in);
      String abc = sc.nextLine();
      int nl = abc.length();
      for(int i=0;i<nl;i++){
	String result = char.toUpperCase(charAt(0));
			char ch1 = abc.charAt(i);
	
	System.out.println("Character at " +i+ "index is:"+ch1);
	
      }*/
    	
    	System.out.println("enter the name");
    	Scanner sc = new Scanner(System.in);
    	String abc = sc.nextLine();
    	String result =String.valueOf(abc.charAt(0));
        System.out.println(result.toUpperCase()+"" +abc.substring(1)+1);
    	
    	
    	/*String s = "this String"; 
    	s= s.substring(0,2).toUpperCase() + s.substring(1);
    	System.out.println(s);*/  
    	
    
    
    }
}