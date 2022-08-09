public class ButterflyPattern {
    public static void main(String args[]) {
        int n = 4;
        // upper side
        for (int i = 1; i <= n; i++) {
            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // upper spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower side
        for (int i = n; i >= 1; i--) {
            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // upper spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}