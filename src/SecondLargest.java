import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n  = sc.nextInt();
        if(n < 2){
            System.out.println(-1);
            return;
        }
        int arr[] = new  int[n];
        for(int input = 0;input < n ; input++){
            arr[input] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }else if (arr[i] > second_max &&   arr[i] < max) {
                second_max = arr[i];
            }
        }
    System.out.println("second largest elem is "+second_max);
    }
}
