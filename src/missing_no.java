import java.util.Scanner;

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
