// in for loop nothing is mandatory just except two semicolons
// even for( ; ; ) {} is true
// can do initilization before loop and condition inside the loop in if else
// can do updation inside the loop as well

// import java.util.Scanner;

// public class A5_loops {

    // static void prime(int a) {
    //     for(int i=2; i<a; i++) {
    //         if(a%i==0) {
    //             return;
    //         }
    //     }
    //     System.out.println(a);
    // }
 
    // public static void main(String[] args) {
    //     Scanner se = new Scanner(System.in);
    //     int a = se.nextInt();
    //     for(int i=2; i<=a; i++) {
    //         prime(i);
    //     }
    // }

    // static void prime(int a){
    //     for(int i=2; i<a; i++) {
    //         if(a%i==0) {
    //             return;
    //         }
    //     }
    //     System.out.println(a);
    // }

    // public static void main(String[] args) {
    //     Scanner se = new Scanner(System.in);
    //     int a = se.nextInt();
    //     for(int i=1; i<=a; i++) {
    //         if(a%i==0) {
    //             prime(i);
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner se = new Scanner(System.in);
    // int a = se.nextInt();
    // if(a%4==0 && a%400==0 && a%100!=0 && a%2000!=0) {
    //     System.out.println("leap year");
    // } else {
    //     System.out.println("not leap");
    // }
    // }

//     public static void main(String[] args) {
//         Scanner se = new Scanner(System.in);
//         int a = se.nextInt();

//         for(int i=0; i<a; i++) {
//             for(int j=0; j<a-i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }

// }

// in "or" operator conditions are checked until there's a true condition 
// (so all operations are performed till that condition)
// in "and" operator conditions are checked until there's a false condition

public class A5_loops {

    public static void main(String[] args) {
        int a=1, b=0, c=-1, d=2;
        if(--a>0 || b++>0 || c++>0) { // in this condition, every condition is checked until a condition is true,
            // a becomes 0, b becomes 1, c becomes 0
            System.out.println("Hi");
        } else if(a++>0 && b-->0 && c++>0 && d-->0) { // here and operator, so if the first condition is wrong, then further ones won't be checked
            // a becomes 1, other variables remains at previous values
            System.out.println("Hello");
        } else if(--a>0 && b++>0 && c-->0 && d++>0) {
            // a becomes 0, other variables remain same
            System.out.println("World");
        } else {
            System.out.println("Lol");
        }
        System.out.println(a + " " + b + " " + c + " " + d);
        // so a=0, b=1, c=0 and d=2;
    }
}
