import java.util.*;

public class Palindrome{
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String reverse = "";

        for(int i = str.length()-1; i >= 0 ; i--) {
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}