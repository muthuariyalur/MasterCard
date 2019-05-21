/**
 * 
 */
package test;

/**
 * @author MAlangaram
 *
 */
public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        int itemA=1;
        int itemB=2;
      double priceA=10.0;
      double priceB=9.0;  

        double price = calculatePromotion(itemA, itemB, priceA, priceB);

        System.out.println("Price : " + price);

	}
	
	//Calculate the Promotion price
    static double  calculatePromotion(int iItemA,int iItemB,double iPriceA,double iPriceB) {
     
      double price = (iItemA*iPriceA)+ ((iItemA*iPriceB)/iItemB)+ (iItemB-iItemA)*iPriceB;  
      return price;
   }

}
