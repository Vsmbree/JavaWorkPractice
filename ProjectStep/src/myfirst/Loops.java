package myfirst;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This sample code creates a two dimensional array and populates each field 
	       int j=0;  // keeps track of column position
	      int k=0;  //this variable is what we are populating the array with
	        int[][] multD = new int[5][10];
	        for(int i=0;i<5;i++)
	        {   
	        if(j>0)
	        {k--;
	        }
	           j=0;
	        multD[i][j]=k; //store the value of k inside multidimensional array
	        System.out.println(multD[i][j]);
	        k++;
	        for(j=0;j<10;j++)
	        {
	        multD[i][j]=k;
	        System.out.println(multD[i][j]);
	        k++;
	        }
	    
	        
	        System.out.println(multD[2] [8]);

		}
	}

}
