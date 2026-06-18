
// Linear Search Algorithm in Java to search a target element
import java.util.*;

public class Linearsearch {
    public static void main(String[] args) {
        int[] nums = {1, 3 ,5 ,7,9};
        int target = 5;
        int ans = Linear( nums , target);
        System.out.println(ans);

    }

    static int Linear(int[] arr, int target) {

        if(arr.length == 0) {
          return -1;
        }
           for(int index = 0 ; index < arr.length ; index++) {
            if(arr[index] == target) {
                return index;
            }
           }
            return -1;
    }
}