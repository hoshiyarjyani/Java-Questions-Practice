import java.util.Scanner;

// we create a function  to  calculate area of circle;
public class calculateCircleArea {
    public static int areaCircle(int r){
        int area = 3*r*r; // value of pai is 3 (Mantion in the question)

        //we return  because the function return type is integer;
        return area;
    }
    public static void main(String args[]){
        // Now we take input from the user in  the form of radius;
        Scanner sc= new Scanner(System.in);
        int r =  sc.nextInt();

        //we call our area function  in  print statement;
        System.out.println(areaCircle(r));
    }
}
