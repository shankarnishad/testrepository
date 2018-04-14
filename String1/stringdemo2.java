package String1;

import java.util.Scanner;

public class stringdemo2 {


	    public static String convertName(String name) {
	    	
	    	String i = name.substring(0,name.indexOf(" "));
	    	int l = i.length();
	    	String firstletter =String.valueOf(name.charAt(0)).toUpperCase();
	        String firstName = name.substring(1, name.indexOf(" ")-(l-1));
	        
	        String lastName = name.toLowerCase().substring(name.indexOf(" ") + 1); 
	        String cName =  firstletter+""+firstName + "." + lastName;  
	        return cName;
	    }
	    public static void main(String args[]) {
	    	System.out.println("enter number");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i=1;i<=n;i++){
				Scanner sc1 = new Scanner(System.in);
				String name = sc1.nextLine();
				 name = convertName(name);  
			        System.out.println(name); 
			        
			}
	         
	    }
	}