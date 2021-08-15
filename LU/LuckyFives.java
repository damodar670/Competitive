/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//input for N and Q
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int array[] = new int[N];
		//Reading input for N
		for(int i=0;i<N;i++)
		{
		    array[i] = sc.nextInt();
		}
		//reading Queries and processing them and storing it into result
		int result [] = new int[Q];
		for(int m=0; m<Q;m++)
		{
		    //By Default Queries length is 2
		    int Queries[] = new int[2];
		    for(int i=0;i<2;i++)
		    {
		        Queries[i]=sc.nextInt();
		    }
		    // main logic Goes here
		    //count to keep track of Triplets
		    int count = 0;
		    
		    //Base case:
		    if(Queries[0] >= Queries[1] )
		    {
		        //Nothing to do in this case
		    }
		    else
		    {
		        for(int i=0;i<N;i++)
		        {
    		        if(array[Queries[0]-1]>array[i])
    		        {
        		        for(int j=i;j<N-1;j++)
        		        {
        		            if(array[i]<array[j])
        		            {
        		                for(int k = j;k<N-2;k++)
        		                {
        		                    if((array[j] >array[k]) && (array[k] < array[Queries[1]-1]))
        		                    {
        		                        count++;
        		                    }
        		                }
        		             }
        		          }
        		      }
		        }
		    }
		    //updating the Results
		    result[m]=count;
		}
		
		//Printing the Results
		for(int i=0;i<Q;i++)
		{
		    System.out.println(result[i]);
		}
	}
}

