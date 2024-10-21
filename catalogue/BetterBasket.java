package catalogue;

import java.io.Serializable;
import java.util.Collections;
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

  List<Basket> list; 

  //Collections.sort(list){	 

  //} 

   

  public int compareTo(Product o) { 

	  int result = o.getProductNum().compareToIgnoreCase(o.getProductNum()); 

	  if(result !=0) { 

	  return result; 

  }else { 

	  return 0; 

  } 

  } 
  

  // You need to add code here
  // merge the items for same product,
  // or sort the item based on the product number
}
