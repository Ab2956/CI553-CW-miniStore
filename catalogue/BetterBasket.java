package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;

  public BetterBasket() { 
  } 

  List<Basket> productList; 
  
  
  public void sortList() {
	  
	  Collections.sort(this, new Comparator<Product>(){
		  
		  
		  public int compare(Product pr1, Product pr2) {
			  return pr1.getProductNum().compareToIgnoreCase(pr2.getProductNum());
		  }
	  });
  }
  
  
  
}
// public void sortProNum(Comparator<Product> comparator) {
//	 
//	 Collections.sort(this, Comparator<Product>()){
//		 @Override
//		 public int compareTo(Product p1, Product p2) {
//			 return.p1.getProductNum().compareToIgnoreCase(p2.getProductNum());
//		 } 
//	 }
// }
 
 

   

//  public int compareTo(Product o) { 
//
//	  Product thisProduct = this.getProduct(); 
//      return thisProduct.getProductNum().compareToIgnoreCase(o.getProductNum());
//
//  }

 

  
  

  // You need to add code here
  // merge the items for same product,
  // or sort the item based on the product number

