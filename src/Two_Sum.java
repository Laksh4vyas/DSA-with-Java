import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int rem = target - arr[i];
            if(arr[i] == rem){
                System.out.println(rem);
            }
        }
    }
}

