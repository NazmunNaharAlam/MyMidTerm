package datastructure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */




				List<String> usa = new ArrayList<String>();
				usa.add("New York");
				usa.add("Denver");
				usa.add("Phoenix");
				usa.add("Jersey city");
				usa.add("LA");
				usa.add("San jose");
				usa.add("SF");
				usa.add("New Haven");
				usa.add("Kansas");
				usa.add("Georgia");

				List<String> uk = new ArrayList<String>();
				uk.add("London");
				uk.add("scotland");
				uk.add("Iceland");

				List<String> canada = new ArrayList<String>();
				canada.add("Torronto");
				canada.add("Quebec");
				canada.add("Alberta");



				Map<String, List<String>> country = new LinkedHashMap<String, List<String>>();

				country.put("USA", usa);
				country.put("UK", uk);
				country.put("CANADA", canada);

				for(Entry<String, List<String>> key:country.entrySet()){

					System.out.println(key.getKey()+ "---->"+ key.getValue());
				}


	}

}





