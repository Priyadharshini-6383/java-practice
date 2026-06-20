import java.util.*;

public class Floor {  // largest element <= target 
    public static void main(String[] args) {

        int[] arr = {2 , 3, 5 ,9 , 14 , 16 , 18};
        int target = 15;

        int floor = Floortarget(arr , target);
        System.out.println(floor);
    }

    static int Floortarget(int[] arr , int target){

        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if(isAscending) {
                if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return end;

    }
}