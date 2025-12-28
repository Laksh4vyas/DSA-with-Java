import java.util.Scanner;

public class Count_Frequency_Each_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int value = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] != arr[i+1]){
                System.out.println(value);
            } else if (arr[i] == arr[i+1]) {
                value++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[value]);
        }
    }
}
