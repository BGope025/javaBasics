import java.util.LinkedList;
import java.util.Scanner;

public class LL5 {
    linkedListBasic.Node head;
    private int size;

    class Node {
        String data;
        linkedListBasic.Node next;

        Node(String data) {
            this.data= data;
            this.next= null;
            size++;
        }
    }
    public boolean hasNode() {
        return false;
    }

    public static void main(String[] args) {

    }
}
