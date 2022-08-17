public class recursionCountprint {
    public static void printCount(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printCount(n + 1);
    }
    public static void main(String args[]) {
        int n = 1;
        printCount(n);
    }
}
