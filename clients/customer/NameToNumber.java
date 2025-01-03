package clients.customer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NameToNumber extends HashMap<String, String>{
	
	public NameToNumber(){		// Public so other packages can use the function
		
		put("0001","TV");
		put("0002","Radio");
		put("0003","Toaster");
		put("0004","Watch");
		put("0005","Camera");
		put("0006","Music player");
		put("0007","USB driver");
	}
	
	public <T, E> T getNumberByName(Map<T, E>map, E value) {
		for(Entry<T, E> entry: map.entrySet()) {			// for loop to loop through the map
			if(Objects.equals(value, entry.getValue())) { 	// if statement to return the key
				return entry.getKey();
			}
		}
		return null;		// return null
	}
}




