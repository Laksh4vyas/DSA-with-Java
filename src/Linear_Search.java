import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to check present in an array or not");
        int target = sc.nextInt();
        int found = 0;
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                found = 1;
                pos = i;
                break;
            }
        }
        if(found == 1){
            System.out.println("element found at ::: "+pos);
        }
        else{
            System.out.println("not found");
        }
    }
}
