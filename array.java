package dsa_Array;
import java.util.Scanner;

public class array {
	
	int [] myArray;
	int n;
	 Scanner sc=new Scanner(System.in);
	 static Scanner sc1 = new Scanner(System.in);
	public void getdata()
	{
		
		System.out.println("Enter number of elements for array");
		n = sc.nextInt();
		myArray = new int[n];
	    System.out.println("Enter elements of array");
	    for(int i=0;i<n;i++)
	    {
	    	myArray[i]=sc.nextInt();
	    }
	    System.out.println("Elements inserted successfully");
	}
	
	public void printArray()
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(myArray[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public void updateElement()
	{
		System.out.println("Enter the position of the element you want to update ");
		int position;
		position = sc.nextInt();
		System.out.println("Enter replaced element");
		int relement = sc.nextInt();
		myArray[position-1]=relement; 
		System.out.println("Element has been updated");
	}
	
	public void removeEven()
	{
		int oddcount=0;
		for(int i=0;i<n;i++)
		{
			if(myArray[i]%2!=0)
			{
				oddcount++;
			}
		}
		
		int [] oddArray = new int[oddcount];
		int j=0; //traversal variable for oddArray
		for(int i=0;i<n;i++)
		{
			if(myArray[i]%2!=0)
			{
				oddArray[j]=myArray[i];
				j++;
			}
		}
		
		//printing odd array
		for(int i=0;i<oddcount;i++)
		{
			System.out.print(oddArray[i]);
			System.out.print(" ");
		}
		System.out.println();
		
	}
	
	public void reverseArray()
	{
		for(int i=0;i<(n/2);i++)
		{
			int temp = myArray[i];
			myArray[i]=myArray[n-i-1];
			myArray[n-i-1]=temp;
		}
		
	}
	
	public void minElement()
	{
		int min = myArray[0];
		for(int i=1;i<n;i++)
		{
			if(min>myArray[i])
			{
				min = myArray[i];
			}
		}
		System.out.println("Minimum element of the array is:" + min);
		}
	
	public void secondLargest()
	{
		int max = myArray[0];
		int secondMax = myArray[0];
		for(int i=1;i<n;i++)
		{
			if(myArray[i]>max)
			{
				secondMax = max;
				max =myArray[i];
			}
			//if repeating numbers come or array[i] would be less than max but greater than second max 
			else if(myArray[i]>secondMax && myArray[i]!=max)
			{
				secondMax= myArray[i];
			}
		}
		System.out.println("Second Largest Element is :" + secondMax);
		
	}
	public void zeroesAtEnd()
	{
		int j=0; //pointer for traversal through only 0's of array
		for(int i=0;i<n;i++)
		{
			if(myArray[i]!=0 && myArray[j]==0)
			{
				int temp = myArray[i];
				myArray[i]=myArray[j];
				myArray[j]=temp;
			}
			if(myArray[j]!=0)
			{
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
	
		array demo = new array();
		demo.getdata();
		demo.printArray();
		int choice;
		
	   do
	   {
		   System.out.println("-------------------------------------------------------------------------------------------------------");
		   System.out.println("Array Menu");
			System.out.println("1.Update Array");
			System.out.println("2.Remove Even Elements from Array");
			System.out.println("3.Reverse the elements of array");
			System.out.println("4.Minimum element Of Array");
			System.out.println("5.Second Largest Element of Array");
			System.out.println("6.Zeroes At end");
			System.out.println("0.Exit");
			System.out.println("Enter Choice Of code");
		     choice = sc1.nextInt();
		     System.out.println("------------------------------------------------------------------------------------------------------");
			
		   switch(choice)
		   {
		   case 1:
			     demo.updateElement();
			     demo.printArray();
			     break;
			     
		   case 2:
			     demo.removeEven();
			     break;
		   case 3:
			     demo.reverseArray();
			     demo.printArray();
			     break;
		   case 4:
			    demo.minElement();
			    break;
		   case 5:
			   demo.secondLargest();
			   break;
		   case 6:
			   demo.zeroesAtEnd();
			   demo.printArray();
			   break;    
		   case 0:
			   break;
		   }
		   
	   }while(choice!=0);
		
		
		


	}

}
