package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Adam Brows 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable, Comparable<BetterBasket>
{
  private static final long serialVersionUID = 1L;

 
  public BetterBasket() { 
	  super();
	  sortList();
  } 
 
  public void sortList() {
	    Collections.sort(this, Comparator.comparing(Product::getProductNum, String::compareToIgnoreCase));
	}

  @Override
  public int compareTo(BetterBasket o) {
	  double thisTotalPrice = this.getTotalPrice();
	  double comTotalPrice = o.getTotalPrice();
	  
	  return Double.compare(thisTotalPrice, comTotalPrice);
  		}

  public double getTotalPrice() {
	
	return  this.stream().map(product -> product.getPrice() * product.getQuantity()).count();
  	}
  
  public void mergePro() {
	  
	  for(int i = 0; i < this.size();i++) {
		  Product thisProduct = this.get(i);
		  
		  for(int j = i + 1; j > this.size();j++) {
			  Product nextProduct = this.get(j);
		  
			  if(thisProduct.getProductNum().equalsIgnoreCase(nextProduct.getProductNum())) {
				  thisProduct.setQuantity(thisProduct.getQuantity() + nextProduct.getQuantity());
				  
				  this.remove(j);
			  }
			  
		  }
		  
	  }
  }
   
} 




//  public String getDetails() {
//	  sortList();
//	  return super.getDetails();
//  }
  

 
  //  public void sortList() {
//	  
//	  Collections.sort(this, new Comparator<Product>(){
//		  
//		  public int compare(Product pr1, Product pr2) {
//			  return pr1.getProductNum().compareToIgnoreCase(pr2.getProductNum());
//		  }
//	  });
//  }
  


//  public int compareTo(Product o) { 
//
//	  Product thisProduct = this.getProduct(); 
//      return thisProduct.getProductNum().compareToIgnoreCase(o.getProductNum());
//
//  }

  // You need to add code here
  // merge the items for same product,
  // or sort the item based on the product number

