import java.util.Scanner;

public class A4_scannerClass {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        String name = se.nextLine();
        int age = se.nextInt();
        se.nextLine();
        String gender = se.nextLine();
        double rollno = se.nextDouble();
        double fees = se.nextDouble();
        se.nextLine();
        String country = se.nextLine();
        boolean marital = se.nextBoolean();

        System.out.print(name + " " + age + " " + gender + " " + rollno + " " + fees + " " + country + " " + marital);

    }
}

// print the value of name, age, gender, roll no;
// while taking input with string and double we should use object.nextLine() because strings and doubles occupy
// whole space which 