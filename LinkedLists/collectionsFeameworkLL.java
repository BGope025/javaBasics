import java.util.LinkedList;

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

        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+"--> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

    }
}
