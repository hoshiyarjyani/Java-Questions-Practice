public class numberpyramid1to10 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                int sum = 0;
                sum += i;
                System.out.print(" " + sum);
            }
            System.out.println();
        }

    }
}
