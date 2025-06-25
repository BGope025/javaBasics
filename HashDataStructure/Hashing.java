import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        // creating HashSet
        HashSet<Integer> set = new HashSet<>();

        // inserting data into set {.add()}
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // adding duplicate items will get only one of them stored in set

        // searching data into set {.contains()}
        if (set.contains(1))
            System.out.println("present");
        else
            System.out.println("absent");

        // deleting data from set {.remove()}
        set.remove(1);
        if (!set.contains(1))
            System.out.println("element removed");

    }
}
