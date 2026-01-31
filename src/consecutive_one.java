import java.util.Scanner;

public class consecutive_one {
    public static void main(String[] args) {
        int count = 0;
        int maxcount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
        System.out.print(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1){
                count++;
                if(count > maxcount){
                    maxcount = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.println(maxcount);
    }
}
