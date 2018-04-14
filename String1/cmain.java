package String1;

import java.util.Scanner;

public class cmain {
	
	public static void main(String[] args) {
       Calc calc = new Calc();
       Input input = new Input();
       System.out.println("enter the number");
      
       Scanner sc = new Scanner(System.in);
      
       input.setA(sc.nextInt());
       input.setB(sc.nextInt());
   
       
       calc.add(input.getA(),input.getB());	
       calc.sub(input.getA(),input.getB());	
       calc.mul(input.getA(),input.getB());	
       calc.div(input.getA(),input.getB());
       
       

	
	}

}
