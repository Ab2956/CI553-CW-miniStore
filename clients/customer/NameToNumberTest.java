package clients.customer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class NameToNumberTest{
	@Test
	<T, E>void testNameToNumber() {
		HashMap<String, String> basket = new NameToNumber();
		basket.put("0001","TV");
		basket.put("0002","Radio");
		basket.put("0003","Toaster");
		basket.put("0004","Watch");
		basket.put("0005","Camera");
		basket.put("0006","Music player");
		basket.put("0007","USB driver");
		
		String name = "TV";
		assertEquals("0001", ((NameToNumber) basket).getNumberByName(basket, name), "error: nameTonNuber");
	}
}
