// a programe in  which match t 20  runs are calculated;

import java.util.Scanner;

public class runInCricket {
    public static int calRuns(int N, int n1, int n2, int n3, int n4, int n5, int n6) {
        int remainRun = N - (n1 + n2 + n3 + n4 + n5 + n6);
        return remainRun;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();
        if (N <= 80 && 40 <= N && n1 <= 6 && 1 <= n1 && n2 <= 6 && 1 <= n2 && n3 <= 6 && 1 <= n3 && n4 <= 6 && 1 <= n4
                && n5 <= 6 && 1 <= n5 && n6 <= 6 && 1 <= n6) {
            System.out.println(calRuns(N, n1, n2, n3, n4, n5, n6));
        }
    }
}
