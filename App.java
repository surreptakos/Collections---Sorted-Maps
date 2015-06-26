import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {

}

public class App {

	public static void main(String[] args) {
		// You don't need to type HashMap or LinkedHashMap or whatever on the
		// left-hand side. You just need to state the interface implemented
		Map<Integer, String> hashMap = new HashMap<Integer, String>();

		// HashMap with doubly linked list connecting the entries to maintain a
		// predictable iteration order. Will iterate through items in the order
		// that you put them in (acts as a queue)
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		// outputs Temp@19e0bfd. 19e0bfd is the hashcode which is used to store
		// things in the HashMap
		System.out.println(new Temp());

		// sorts thing in natural order (1,2,3,4,5 or a,b,c,d,e)
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		testMap(treeMap);

	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "giraffe");
		map.put(8, "swan");
		map.put(1, "cat");
		map.put(0, "dog");
		map.put(15, "bear");
		map.put(6, "snake");

		for (Integer key : map.keySet()) {
			String value = map.get(key);

			System.out.println(key + ": " + value);
		}

	}

}