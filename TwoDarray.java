import java.util.Scanner;

public class TwoDarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter rows");
        int rows = sc.nextInt();
        System.out.println("please enter cols");
        int cols = sc.nextInt();
        // input of 2D Array...
        int Matrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}