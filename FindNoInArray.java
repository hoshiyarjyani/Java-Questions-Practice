import java.util.Scanner;

import javax.swing.text.InternationalFormatter;

public class FindNoInArray {
    public static void main(String args[]) {
        // set the length of a Arraay
        System.out.println("Set the Length of a Array");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int Numbers[] = new int[x];

        // put the values in array(Numbers)
        for (int i = 0; i < x; i++) {
            Numbers[i] = sc.nextInt();
        }

        // find out the Position of a number in array put by user randomly
        System.out.println("put any no from the arrray");
        int a = sc.nextInt();
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == a) {
                System.out.println("The position of  a " + i);
            }
        }
    }
}
