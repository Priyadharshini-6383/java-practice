// import java.util.*;

// public class Functionwithparameter{

//     void function(int a) {  //with parameter
//         System.out.println(a);
//         System.out.println("Get Soap");
//     }

//     public static void main(String args[]) {
//         Functionwithparameter obj = new Functionwithparameter();
//        obj.function(10);
//     }
// }



// add two numbers and print output  with parameter 

import java.util.*;

public class Functionwithparameter{

    void Sum(int a , int b) {
       int sum = a + b;
        System.out.println("Sum of a and b : " + sum);
    }

    

    public static void main(String[] args) {
        Functionwithparameter obj = new Functionwithparameter();
        obj.Sum(10,20);

        
}
}
