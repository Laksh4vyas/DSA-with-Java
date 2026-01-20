public class complete_LL {

    Node head;
    int size = 0;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
            size++;
        }
    }

    void addAtFirst(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    void addAtEnd(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
        size--;
    }

    int getSize() {
        return size;
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        complete_LL list = new complete_LL();

        list.addAtFirst(10);
        list.addAtFirst(20);
        list.addAtEnd(30);
        list.printList();

        list.deleteAtFirst();
        list.printList();

        list.deleteAtEnd();
        list.printList();

        System.out.println(list.getSize());
    }
}
