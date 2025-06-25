import java.util.HashSet;
import java.util.Iterator;

// notes for hashset
public class Hashing {
    public static void main(String[] args) {
        // creating HashSet
        HashSet<Integer> set = new HashSet<>();

        // inserting elements into set {.add()}
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(1); // adding duplicate items will get only one of them stored in set

        // searching element into set {.contains()}
        if (set.contains(1))
            System.out.println("present");
        else
            System.out.println("absent");

        // deleting element from set {.remove()}
        set.remove(1);
        if (!set.contains(1))
            System.out.println("element removed");

        // size of set
        System.out.println("No of elements in set is..."+set.size());

        // print all elements of set
        System.out.println(set);

        // iteration
        Iterator it = set.iterator();

        // 2 properties of iterator --> i) .next() ; ii) .hasNext()
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
