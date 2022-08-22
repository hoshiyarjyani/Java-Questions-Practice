//Poewr ranger function a*5+b*4+c*3+d*2+e;

import java.util.Scanner;

public class powerRangers {
    public static int powFun(int a, int b, int c, int d, int e){
        int result =  (5*a)+(4*b)+(3*c)+(2*d)+e;
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
    System.out.println(powFun(a, b, c, d, e));
    }
}
