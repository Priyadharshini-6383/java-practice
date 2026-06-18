// Creating the array and getting input from the user 

// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         int [] arr = new int[5];
//         Scanner sc = new Scanner(System.in);
//         for(int i = 0 ; i < arr.length;i++) {
//             arr[i] = sc.nextInt();
//             System.out.print(arr[i] + " ");   // best way to print array ( System.out.println(Arrays.toString(arr));) --> it will convert array in string format like [,<number>,<number>,<number>,<number>]
//         }
//     }
// }

// Mutable means we can able to change the object after creating it and Immutable means we can't change the object after creating it.


// 2D Array
import java.util.*;
public class Array{
    public static void main(String[] args) {
        int [][] arr = new int [3][2];       // there is no need of declaring the coloumn in 2D array but it is good to declare it because it will help us to avoid the error and it will also help us to understand the code better.
        Scanner sc = new Scanner(System.in);  // 3 is row and 2 is coloumn in 2D array

           for(int row = 0; row < arr.length ; row++) {
            for(int col = 0; col < arr[row].length; col++){ 
              arr[row][col]= sc.nextInt();

              System.out.print(arr[row] [col] + " ");
         }  
         System.out.println();  //this line is used to print the next line after printing the first row of the 2D array, so that the next row will be printed in the next line.
 
          }
         }
}

