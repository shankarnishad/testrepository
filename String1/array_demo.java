package String1;

public class array_demo {

	public static void main(String[] args) {
		
		int arr[]={10,20,30,40};
		for(int i=0;i<=arr.length;i++)
		{
			int min=arr[i];
			int p=i;
			for (int j =(i+1);j<arr.length;j++){
				
				if (arr[j]<min)
				{
					min =arr[j];
					p=j;			
				}
			}
			
			int temp= arr[i];
			arr[i]=min;
			arr[p]=temp;
			
	System.out.println(p);		
		}
		
		
	}

}
