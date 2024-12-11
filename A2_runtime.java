// public class A2_runtime {
//     public static void main(String[] args) {
//         System.out.println("Hello World" + " " + args[0] + " " + args[5]); 
//         // if we want to pass arguments in runtime itself then this is the method
//     }
// }

// type casting means assigning a value of one type to a variable of another type is known as typecasting

// two types of typecasting = widening and narrowing
// widening means from small datatype to big dataype and narrowing is exactly opposite

// byte, short, int, long, float, double

// public class A2_runtime {
//     public static void main(String[] args) {
//         double mydouble = 1023.78d; // intialized double
//         int myinteger = (int)mydouble; // typecasting (narrowing)
//         byte myByte = (byte)myinteger; // 1023 is out of byte range so it may give a garabage value
//        // boolean myBool = (boolean)mydouble; this cant be done in java, is not allowed

//         System.out.println(mydouble);
//         System.out.println(myinteger);
//         System.out.println(myByte);

//     }
// }

// primtive datatype are predefined datatypes like int, byte....

public class A2_runtime {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        
        System.out.println("addition " + (a+b));
        System.out.println("subtraction " + (a-b));
        System.out.println("Multiplication " + (a*b));
        System.out.println("division " + (a/b));
        System.out.println("modulus " + (a%b));

        boolean c = true;
        boolean d = false;

        System.out.println(c&&d);
        System.out.println(c|d);
        System.out.println(!c);


        
    }
}

// compiler based langauge

// Java source code (written in .java files) is first compiled by the Java Compiler 
// (javac) into an intermediate form called bytecode. (JVM)
// This bytecode is stored in .class files, which are platform-independent and 
// not directly executable by the operating system

// interpreter based language

// The Java Virtual Machine (JVM) reads the bytecode and interprets or executes it.
// During this process, the JVM either:
// Interprets the bytecode directly, translating it into machine code line by line at runtime.
// Or uses a Just-In-Time (JIT) compiler to compile the bytecode into native machine code for faster execution.