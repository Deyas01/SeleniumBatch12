package com.syntax.class10;

public class Rep80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
				};
	
			//Double and print array;
	      for (int i = 0; i < a.length; i++) { 
	         for (int j = 0; j < a[i].length; j++) { 
	            System.out.print(a[i][j]+" ");
	         }
	         System.out.println();
	         
	      }
	      System.out.println("Neeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
	      
	      double[][] b = {{1.4,2.0,3.3,2},{4,1.5,6.1,1},
	    	      {1.2,3.1,4,1.6}
	    	    };
	    	    //Double and print array
	    	  for(int i =0; i < 3; i++){
	    	    for(int j = 0; j < 4; j++){
	    	      a[i][j]=a[i][j]*2;
	    	System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    	}
	    	  System.out.println("_______________________________");
	    	  
	    	  double[][] c = {
	                  {1.4,2.0,3.3,2},
	                  {4,1.5,6.1,1},
	                  {1.2,3.1,4,1.6}
	          };

	          //Double and print array

	          for (double[] doubles : c) {

	              for (double aDouble : doubles) {

	                  System.out.print(2*aDouble + " ");
	              }
	              System.out.println();
	          }



	      }


	    	}
	    	
	   
	
	
