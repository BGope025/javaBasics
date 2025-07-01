import java.util.HashMap;

// HashMap notes
public class HashingMap {
    public static void main(String[] args) {
        // creating HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // adding key-value pair
        map.put("USA", 100);
        map.put("China", 180);
        map.put("India", 150);
        System.out.println(map);

        // updating key-value pair
        map.put("China", 190);
        System.out.println(map);

        // searching key
        if (map.containsKey("China"))
            System.out.println("key exists");
        else
            System.out.println("key doesn't exists");

        // getting the value
        System.out.println(map.get("China")); // key exists
        System.out.println(map.get("Indonesia")); // key doesn't exist
    }
}
