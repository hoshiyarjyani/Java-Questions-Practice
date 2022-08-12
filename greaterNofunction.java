//Write a function which takes in 2 numbers and returns the greater of those two.


import java.util.Scanner;

public class greaterNofunction {
    public static void greaterNo(int a, int b) {
        if(a>b){
            System.out.println(a+ " is greater then "+ b);
        }else{
            System.out.println(b+" is greater then "+a);
        }
         }
         public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            greaterNo(a, b);            
         }
}
