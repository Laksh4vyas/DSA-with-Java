import java.util.Scanner;
import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.println("Enter element to search for:");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not present in array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}