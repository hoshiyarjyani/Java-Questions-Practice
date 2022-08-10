import java.util.Scanner;

public class printThreeNoMultiplyWithFunction {
    public static int calculateMultiply(int a, int b, int c) {  
        return (a*b*c);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(calculateMultiply(a, b, c));
    }
}
