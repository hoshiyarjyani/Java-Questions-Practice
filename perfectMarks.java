// Programe for the perfect marks calculate;

import java.util.Scanner;

public class perfectMarks {
    public static int marksRemain(int maths, int phy, int chem) {
        int result = 450 - (maths + phy + chem);
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        int phy = sc.nextInt();
        int chem = sc.nextInt();

        if (1 <= maths && 1 <= phy && 1 <= chem && maths <= 150 && phy <= 150 && chem <= 150) {
            System.out.println(marksRemain(maths, phy, chem) + " Marks Remain for the perfect marks");
        } else {
            System.out.println("invalid marks");
        }
    }
}
