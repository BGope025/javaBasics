import java.util.HashMap;

// wap to find itinerary from tickets
public class H4 {
    // to find the starting point
    public static String getStart(HashMap<String, String> map) {
        HashMap<String, String> reversedMap = new HashMap<>();

        for (String key: map.keySet()) {
            reversedMap.put(map.get(key), key);
        }

        for (String key: map.keySet()) {
            if (!reversedMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // entering the data
        map.put("Chennai","Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        // finding the starting point
        String start = getStart(map);

        // printing the route
        while (map.containsKey(start)) {
            System.out.print(start+"-->");
            start = map.get(start);
        }
        System.out.println(start);
    }
}
