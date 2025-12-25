import java.util.*;
public class array_sorted_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no < 2){
            System.out.println(no);
            return;
        }
        int[] arr = new int[no];
        for(int input=0;input<no;input++){
            arr[input] = sc.nextInt();
        }
        boolean isSorted = true;
        for(int i = 0 ;i <arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
            if(isSorted){
                System.out.println("Sorted");
            }
            else{
                System.out.println("Not Sorted");
            }
        }
    }

