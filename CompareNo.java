import java.util.Scanner;

public class CompareNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a is greater then  b");
        } else if (a < b) {
            System.out.println(" b is greater then a");
        } else {
            System.out.println("a is equal to b");
        }
    }

}
