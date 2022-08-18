public class factorialRecursion {
    public static void factorialNo(int n, int multiply) {
        if (n == 1) {
            multiply *= n;
            System.out.println(multiply);
            return;
        }
        multiply *= n;
        factorialNo(n - 1, multiply);
    }

    public static void main(String args[]) {
        factorialNo(5, 1);
    }
}
