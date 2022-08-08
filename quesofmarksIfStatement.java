import java.util.Scanner;

public class quesofmarksIfStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 1) {
            if (b >= 70) {
                System.out.println("wow osm marks / superb");
            } else if (b >= 40) {
                System.out.println("very good marks");
            }

            else {
                System.out.println("well try");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
