import java.util.LinkedList;

// This has the solution of Collections Framework used in LinkedList
public class collectionsFeameworkLL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("list");
        list.addFirst("This");
        System.out.println(list);

        list.add("only!");
        System.out.println(list);
        System.out.println(list.size());

        for (String s : list) {
            System.out.print(s + "--> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

    }
}
