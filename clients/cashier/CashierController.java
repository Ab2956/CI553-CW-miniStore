package clients.cashier;

import middle.StockException;

/**
 * The Cashier Controller
 */

public class CashierController
{
  private CashierModel model = null;
  private CashierView  view  = null;

  /**
   * Constructor
   * @param model The model 
   * @param view  The view from which the interaction came
   */
  public CashierController( CashierModel model, CashierView view )
  {
    this.view  = view;
    this.model = model;
  }

  /**
   * Check interaction from view
   * @param pn The product number to be checked
   */
  public void doCheck( String pn, int buyMany)
  {
    model.doCheck(pn, buyMany);
  }

   /**
   * Buy interaction from view
   */
  public void doBuy()
  {
    model.doBuy();
  }
  
  // Clear interaction from view
  
  public void doClear() throws StockException {
	  
	  model.doClear();
  }
  
   /**
   * Bought interaction from view
   */
  public void doBought()
  {
    model.doBought();
  }
}
