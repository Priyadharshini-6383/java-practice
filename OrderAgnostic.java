import java.util.*;

public class OrderAgnostic {
    public static void main(String[] args) {

        int[] arr = {1 , 2 , 4 , 5 ,7 ,8 ,12 ,15};
        int target = 8;
        int ans = orderagnostic(arr , target);
        System.out.println(ans);

    }

    static int orderagnostic(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end]; // condition to checking the array is in ascending order


    while(start <= end) {
        int mid = start + ( end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(isAsc) {
          if(target > arr[mid]) {    // ascending order need to increase start = mid + 1
            start = mid + 1;
          } else {
            end = mid - 1;
          }
        } else {               // descending order
            if (target > arr[mid]) {   // descending order need to decrease end = mid - 1
                end = mid - 1; 
            } else {
                start = mid + 1;
            }
        }

    }
        
        return -1;
    }
}