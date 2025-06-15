// LinkList basic operations
public class linkedListBasic {
    Node head;
    private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data= data;
            this.next= null;
            size++;
        }
    }

    linkedListBasic() {
        this.size = 0;
    }

    // Add (first)
    public void addFirst(String data) {
        Node newNode= new Node(data);
        if (head == null) { // corner case
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add (last)
    public void addLast(String data) {
        Node newNode= new Node(data);
        if (head == null) { // corner case
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Print data
    public void printData() {
        if (head== null) { // corner case
            System.out.print("the List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+"--> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Delete (first)
    public void deleteFirst() {
        if (head == null) { // corner case
            System.out.print("The list is empty");
        }
        head = head.next;
        size--;
    }

    // Delete (last)
    public void deleteLast() {
        if (head == null) { // corner case
            System.out.print("The list is empty");
        }

        size--;
        if (head.next == null) { // corner case
            head = null;
            return;
        }

        Node secLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secLastNode = secLastNode.next;
        }
        secLastNode.next = null;
    }

    // Get the size of the LinkList
    // we could use it to decrease the time complexity by having the index known and not required to run loop again and again
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        linkedListBasic list= new linkedListBasic();
        list.addFirst("a");
        list.printData();

        list.addFirst("is");
        list.printData();

        list.addLast("list");
        list.addFirst("This");
        list.printData();

        list.deleteFirst();
        list.printData();

        list.deleteLast();
        list.printData();

        System.out.println("The size is..."+ list.getSize());
    }
}
