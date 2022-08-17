public class recursionPrint {

    public static void printFn(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
        printFn(n - 1);
    }
    public static void main(String args[]) {
        int n = 5;
        printFn(n);
    }
}