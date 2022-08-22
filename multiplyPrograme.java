import java.util.Scanner;

//function  for the multiplying some values to each other;
public class multiplyPrograme {
    public static int calculateMultiply(int k, int a, int b, int c){

        // all  a b c first multiply with k. then  multiply  with  each  other;
        int result = (k*a)*(k*b)*(k*c);
        return result;
    }
    public static void main (String args[]){

        //taking input from  the user;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();

        // if condition  if our int value 1 to  20  then our function work  otherwise it return invalid;
        if(1<=k && 1<=a && 1<=b && 1<=c && k<=20 && a<=20 && b<=20 && c<=20){
            System.out.println(calculateMultiply(k, a, b, c));
        }else{
            System.out.println("invalid Value 'your values can be 1 to 20'");
        }
    }
}
