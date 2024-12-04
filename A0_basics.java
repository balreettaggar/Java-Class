// import java.util.Scanner;

// public class A0_basics {
//     public static void main(String[] args) {
//         System.out.print("Enter a number : ");
//         Scanner se = new Scanner(System.in); // scanner is a class and here we are making its object (named se)
//         int num = se.nextInt(); //nextint to take input in form of integer
//         System.err.print(num);
//     }
// }

import java.util.*;

public class A0_basics {

    public static int addition(int a, int b) {
        return a+b;
    }


    public static void main(String[] args) {
        System.out.print("Enter the first number : ");
        Scanner firstNum = new Scanner(System.in);
        int num1 = firstNum.nextInt();

        System.out.println("Enter the second number : ");
        Scanner secondNum = new Scanner(System.in);
        int num2 = secondNum.nextInt();

        System.out.println(addition(num1, num2));
        
    }
}
