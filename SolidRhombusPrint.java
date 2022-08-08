public class SolidRhombusPrint {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 5; i >= 1; i--) {
            for (int j = n - i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
