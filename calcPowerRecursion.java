public class calcPowerRecursion {
    public static int calcPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int a = calcPower(x, n - 1);
        int b = x * a;
        return b;
    }

    public static void main(String args[]) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
