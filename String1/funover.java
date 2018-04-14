package String1;

public class funover {

	 int s;
	int area(int f){
     s= f*f;
     return s;
		
	}

	 double area(float a){
		return s = (int) (3.14*a*a);
	
		} 
	 float area(double d, double e){
	 
		return s=	 (int) (d*e);	
		} 
	 
	 float area(float d, float c){
		return s =	 (int) (1/2*d*c);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		funover fun = new funover();
		fun.area(10);
	    fun.area(2);
	    fun.area(2, 2);
	    fun.area(5.5, 5.5);
	    
	    System.out.println(fun.s);
	    
	    
	}

}
