
import java.util.LinkedList;

public class frameWork_LinkedLIst {
        public static void main(String[] args) {
            LinkedList<String> li = new LinkedList<String>();
            li.addFirst("is"+"->");
            li.addFirst("a"+"->");
            System.out.println(li);
            li.removeFirst();
            System.out.println(li);
            li.size();
        }
}

