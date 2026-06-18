import java.util.*;


// Factorial using while loop
public class Factorial {
    public static void main(String[] args) {

     System.out.println("Enter the number : ");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int factorial = 1;

     while(n > 0) {
        factorial = factorial * n;
        n--;
     }
     System.out.println("The factorial is : " + factorial);
    }
}