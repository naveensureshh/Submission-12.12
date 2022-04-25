import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;  
import java.util.List;  

class ListTest {
	private java.util.ArrayList<String> numbers  = new ArrayList<String>();
	
	@Test
	public void nums() {
		ArrayList<Integer> arl = new ArrayList<Integer>();
		List<String> expected = ArrayList(" output 5 numbers");
		assertLinesMatch(expected, numbers);
		arl.add(7);  
		arl.add(12);
		arl.add(46);
		arl.add(51);
		arl.add(76);
		
	}
	
       @Test
	private List<String> ArrayList(String string) {
		System.out.println("7,12,,46,51,76");
		assertLinesMatch(numbers, numbers);
		return numbers;
		
	}


	
	}


