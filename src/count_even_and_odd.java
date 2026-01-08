import java.util.Scanner;

public class count_even_and_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                even ++;
            }
            else{
                odd++;
            }
        }
        System.out.println("total even numbers are" + even);
        System.out.println("total off numbers are " + odd);
    }
}
