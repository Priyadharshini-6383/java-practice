import java.util.*;

// searching the element in the given range of array
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3, 4 ,5 , 6};
        int target = 3;
int ans = (LinearSearch(arr , target, 1,5));
        System.out.println(ans);

    }

    static int LinearSearch(int[] arr, int target , int start , int end) {


if(arr.length == 0) {
    return -1;
}

for(int index = start ; index <= end ; index++) {
    if(arr[index] == target) {
return  index;
    }
}
return -1;
    }
}

// Check the minimum value in the array

import java.util.*;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {1 , 3 ,5 ,-3 , 2 , 7};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];

        for(int i = 1; i < arr.length ; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        
return ans;
    }
   
}