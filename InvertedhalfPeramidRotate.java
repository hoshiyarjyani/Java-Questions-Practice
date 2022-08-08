public class InvertedhalfPeramidRotate {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
