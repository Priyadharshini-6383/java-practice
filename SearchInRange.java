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