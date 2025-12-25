import java.util.Scanner;
public class LargestElement {
        public static void main(String[] args) {
            System.out.println("enter the size of array");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }}
            System.out.println("largest elem is " + max);
        }
}

