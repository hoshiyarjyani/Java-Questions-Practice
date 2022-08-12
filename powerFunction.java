//Two numbers are entered by the user, x and n. 
//Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.Scanner;

public class powerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no.");
        int x = sc.nextInt();
        System.out.println("enter the power of the number");
        int n = sc.nextInt();
        int z = 1;
        for (int i = 1; i <= n; i++) {
            z = z * x;
            System.out.println(z);

        }

    }
}
