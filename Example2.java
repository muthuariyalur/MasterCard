/**
 * 
 */
package test;

/**
 * @author MAlangaram
 *
 */
public class Example2 {

	@SuppressWarnings("unused")
	private static int itemA;
	@SuppressWarnings("unused")
	private static int itemB;
	@SuppressWarnings("unused")
	private static int itemC;
	@SuppressWarnings("unused")
	private static int itemF;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		  itemA = 1;
	      itemB = 1;
	      itemC = 1; 
	      itemF = 2;
	      
	      //Declare the price details
	      double priceA=10.0;
	      double priceB=5.0;  
	      double priceC=4.0;
	      double priceF=2.0; 
		
	      // Find the cheapest among the cart(A,B,C)
	      double cheapItem = Math.min(Math.min(priceA, priceB),priceC);
	     
		 // compares the two specified double values
	  	 if(Double.compare(cheapItem, priceA)==0){
	        priceA = 0;
	      }else if(Double.compare(cheapItem, priceB)==0){
	        priceB = 0;
	      }else if(Double.compare(cheapItem, priceC)==0){
	        priceC = 0;
	      } 
	      
	      // Calculate the final price
	      double price = priceA+priceB+priceC+priceF;

	      System.out.println("Price : " + price);
	    }


}
