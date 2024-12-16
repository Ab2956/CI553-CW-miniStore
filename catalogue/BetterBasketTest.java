package catalogue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BetterBasketTest {

	@Test
	void testMergeAddProduct() {
		BetterBasket br = new BetterBasket();
		Product p1 = new Product("0001","TV",12.3,1);
		Product p2 = new Product("0002","Radio",13.4,1);
		Product p3 = new Product("0003","Toaster",10.5,1);
		br.add(p1);
		br.add(p3);
		br.add(p2);
		br.add(p1);
		br.add(p2);
		br.add(p2);
		assertEquals(3,br.size(),"error: merge");
		assertEquals(2,br.get(0).getQuantity(),"error: quantity");
	}
	
	@Test
	void  testSortProduct() {
		BetterBasket br = new BetterBasket();
		Product p1 = new Product("0001","TV",12.3,1);
		Product p2 = new Product("0002","Radio",13.4,1);
		Product p3 = new Product("0003","Toaster",10.5,1);
		br.add(p1);
		br.add(p3);
		br.add(p2);
		assertEquals("0001", br.get(0).getProductNum(), "error: sort");
	}
		
		


}
