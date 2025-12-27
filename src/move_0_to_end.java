import java.util.Scanner;

public class move_0_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pos =0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                arr[pos] = arr[i];
                pos++;
            }
        }
        while(pos < n){
            arr[pos] = 0;
            pos++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
