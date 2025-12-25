import  java.util.*;
public class reverse_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int number = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = number-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
