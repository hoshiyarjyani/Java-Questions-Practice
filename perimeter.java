
// Calculute perimeter of rectangle in  which  data is input by the user between length >= 1 && breadth <= 100;


import java.util.Scanner;
// we create a function  that calculate the perimeter;
public class perimeter {
    public static int calculatePerimeter(int length, int breadth) {
        int result = 2 * (length + breadth);

        //return because it return a integer type value...we mantion in function;
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        //if condition for the check the input is correct or not;
        if (length >= 1  && breadth <= 100 && 0<breadth) {
            System.out.println(calculatePerimeter(length, breadth));
        } else {
            System.out.println("Please enter value between 'length>=1 && breadth<=100'");
        }
    }
}