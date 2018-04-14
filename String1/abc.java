package String1;

import javax.xml.ws.Action;

public class abc implements int_demo,int2_demo
{

	public static void main(String[] args) {
		
		abc ob=new abc();
		ob.display();
		
		abc ob2 = new abc();
		ob2.print();

	}
	@Override
	public void display() {
		
		int_demo.super.display();
	}
	public void print(){
		//int2_demo.super.display();
	}
	
	interface int2_demo {
		 
		 default void display(){
			 System.out.println("b");
		
		 }
	  
		 default void mul()
		 {
			 System.out.println("d");
		 }	 
	}
}
