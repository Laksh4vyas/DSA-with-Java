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
        int[] temp= new int[number];
        int j=0;
        for(int i=number-1;i >= 0; i--){
            temp[j] = arr[i];
            j++;
        }
        for(j=0;j<number;j++) {
            System.out.println(temp[j]);
        }
    }
}
