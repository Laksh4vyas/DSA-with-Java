import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int val){
        data = val;
        next = null;
    }
}
class LinkedList{
    Node head;
    void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " - >");
            temp = temp.next;
        }
    }
}
class LL_isnert_at_end {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            li.insertAtEnd(val);
        }
        li.printLL();
    }
}
