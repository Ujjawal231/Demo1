package demopkg;
import java.util.Scanner;

public class subtract {
    public static void main(String[] args) {
        int a, b, sub;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Eneter the 1st number");
        a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        b = sc.nextInt();
        sub = a - b;
        System.out.println("Subtraction of the a and b is:- " + sub);


    }

}
