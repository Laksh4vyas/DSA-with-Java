import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/* APPROACH 1 ( TIME COMPLEXITY = O(N^2))

public class missing_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num = 0; num <= n; num++) {
            boolean isfound = false;

            for (int i = 0; i < n; i++) {
                if (arr[i] == num) {
                    isfound = true;
                    break;
                }
            }

            if (!isfound) {
                System.out.println("Missing number is: " + num);
                break;
            }
        }
    }
}
*/

/*
APPROACH 2
 */
public class missing_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int len = arr.length;
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int expected_sum = n * (n + 1) / 2;
        int actual_sum = 0;
        for (int i = 0; i < len; i++) {
            actual_sum += arr[i];
        }
        int missing = expected_sum - actual_sum;
        System.out.println("missing number is : "+ missing);
    }
}