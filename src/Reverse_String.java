import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.next();
        char[] arr = s.toCharArray();
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
