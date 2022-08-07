import java.util.Scanner;

public class sumofNnaturalNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int text = 0;
        for (int j = 1; j <= i; j++) {
            text +=j;

        }  
        System.out.println(text);
    }
}
