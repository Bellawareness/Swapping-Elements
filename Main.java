class Main {
  public static void main(String[] args) {
  // 1. Given the plents array below sort them in order by swapping the elements using the different indexes manually. Print out the resulting array using a for each loop. If you don't think Pluto is a planet then you can argue with Brittany on the RevUp Discord.

   String[] planets = {"Neptune", "Mercury", "Earth", "Jupiter", "Venus", "Pluto", "Uranus", "Saturn", "Mars"};
	int src= 0 ;
  int dest = 1;
		   	
String temp = planets [src];
planets [src] = planets [dest];
planets [dest]= temp;


int src1= 1 ;
		   	int dest1 = 4;
		   	
		 	String temp1 = planets [src1];
		   	planets [src1] = planets [dest1];
		   	planets [dest1]= temp1;
		   	
			int src0= 3 ;
		   	int dest0 = 8;
		   	
		 	String temp0 = planets [src0];
		   	planets [src0] = planets [dest0];
		   	planets [dest0]= temp0;
		
		   	
			int src5= 5;
			int dest5 = 8;
				   	
				 	String temp5 = planets [src5];
				   	planets [src5] = planets [dest5];
				   	planets [dest5]= temp5;
				
				   	
					int src4= 4;
					int dest4 = 5;
						   	
						 	String temp4 = planets [src4];
						   	planets [src4] = planets [dest4];
						   	planets [dest4]= temp4;
						   	
						   	int src7= 5;
							int dest7 = 7;
								   	
								 	String temp7 = planets [src7];
								   	planets [src7] = planets [dest7];
								   	planets [dest7]= temp7;  	
						   	
	
  	for (int i = 0; i < planets.length; i++)
	System.out.println( planets[i] );
  }
         
     }
   

  
