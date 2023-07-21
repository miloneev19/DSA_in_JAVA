package dsa_TimeComplexityDemo;

public class timeComplex {

	//two approaches to calculate sum of first n numbers 
	public static void main(String[] args) {
		double now = System.currentTimeMillis();
		
		timeComplex demo = new timeComplex();
		
		System.out.println(demo.approach1(99999));
		System.out.println("Time Taken : " + (System.currentTimeMillis() - now) + "millisecs");
		
		System.out.println(demo.approach2(99999));
		System.out.println("Time Taken : " + (System.currentTimeMillis() - now) + "millisecs");
		
		
	}
	
	public int approach1(int n)
	{
		return n*(n+1)/2;
	}
	
	public int approach2(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum = sum+i;
		}
		return sum;
	}
   //thus approach 1 is better .;
}
