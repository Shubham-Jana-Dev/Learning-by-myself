import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMap{
	public static void main(String[] args){
		ConcurrentMap<String, Integer> myMap = new ConcurrentHashMap<>();
		
		// In JAVA 7 this works as segment beased locking (by default it divids in 16 segments --> smaller hashmaps :))
		
		// Only the segment being written to of read from is locked :)
		
		// READ operation: Do not require locking unless there is a write operation happening of the same segment.
		
		// write: lock
		
		// In JAVA 8 --> no segmentation 
		
		//     --> Compare and Swap approch --> NO LOCKING except resizing or collision. :) 
		
	}
}