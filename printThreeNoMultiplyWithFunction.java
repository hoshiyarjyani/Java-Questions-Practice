import java.util.Scanner;

public class printThreeNoMultiplyWithFunction {
    public static int calculateMultiply(int a, int b, int c) {
        int multiply = a * b * c;
        return multiply;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int multiply = calculateMultiply(a, b, c);
        System.out.println(multiply);
    }
}
