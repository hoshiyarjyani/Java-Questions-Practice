import java.util.Scanner;

public class avarageof3No {
    public static int calculateAvarage(int a, int b, int c) {

        int z = (a + b + c) / 3;
        return z;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(calculateAvarage(a, b, c));
    }
}
