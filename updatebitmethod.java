import java.util.Scanner;

public class updatebitmethod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();

        int n = 5;
        int position = 1;
        int bitmask = 1 << position;

        if (operation == 1) {
            int newNo = n | bitmask;
            System.out.println(newNo);
        } else {
            int negtivebitmask = ~(bitmask);
            int newNo = negtivebitmask & n;
            System.out.println(newNo);
        }

    }
}
