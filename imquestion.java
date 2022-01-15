import java.util.*;
public class imquestion
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number of elements");
	    int n=sc.nextInt();
	    System.out.println("enter the elements ");
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    System.out.println("enter the value of k");
	    int k=sc.nextInt();
	    
	    if(n<k)
	    {
	        System.out.println("invalid output");
	    }
	    else
	    {
	        int max_sum=Integer.MIN_VALUE;
	        for(int i=0;i<n-k+1;i++)
	        {
	        int sum=0;//sum yha ane ke baad zero ho jata hai 
	        for(int j=i;j<k+i;j++)
	            {
	                sum=arr[j]+sum;
	                
	            }
	           max_sum=Math.max(sum,max_sum);
	        }
	        System.out.println(max_sum);
	}
}
}