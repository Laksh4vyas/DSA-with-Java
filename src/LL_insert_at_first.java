import java.util.Scanner;
class Noden{
    int data;
    Node next;
    Noden(int val){
        data = val;
        next = null;
    }
}
class LinkedListn{
    Node head;
    void insertATFirst(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    void PrintLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " - > ");
            temp = temp.next;
        }
    }
}
public class LL_insert_at_first {
    public static void main(String[] args) {
        LinkedListn li = new LinkedListn();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            li.insertATFirst(val);
        }
     li.PrintLL();
    }
}