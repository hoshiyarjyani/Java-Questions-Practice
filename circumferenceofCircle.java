//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class circumferenceofCircle {
    public static double circumference(double r){
        double x = (2*3.14*r);
        System.out.println(x);
        return r;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        circumference(r);
    }
}
