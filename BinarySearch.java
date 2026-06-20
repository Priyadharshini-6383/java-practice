import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-45 , -12 , -5 , -2 , 0 , 1 , 3 ,6 ,10}; // array must be sorted array
        int target = 1;
        int ans = Binarysearch(arr , target);
        System.out.println(ans);

    } 

    static int Binarysearch(int[] arr , int target) {
        int start = 0;
        int end =  arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
              if (target < arr[mid]) {
            end = mid - 1;
        } else if(target > arr[mid]) {
            start = mid + 1;
        } else{
            return mid;  // ans is mid
        }
        }
        return -1;
      
    }
    
  
}