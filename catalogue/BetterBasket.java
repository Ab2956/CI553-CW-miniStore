package catalogue;

import java.io.Serializable;
import java.util.Collections;


import debug.DEBUG;


/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Adam Brows 
 * @version 1.0
 */

public class BetterBasket extends Basket 
{
	@Override
	public boolean add(Product pr) {
	  																// create add method to override from Basket add method.
		DEBUG.trace("add method called: " + pr.getProductNum());	// debug trace to see if add method is called with the productNumber.
		for(Product prList: this) {
			if(prList.getProductNum().equals(pr.getProductNum())) {
			  int quant = pr.getQuantity() + prList.getQuantity();
			  prList.setQuantity(quant);
			  return(true);
			  
		  }
	  }
	  super.add(pr); 
	  Collections.sort(this);
	  return(true);
	 
	  
  }
	
	 
 } 
   


 

