import java.util.*;

public class conditionsquestion {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(age>18) {
        System.out.println("You are Adult " + age + " year old");
    }else{
        System.out.println(" Tum abhi bcha ho...");
    }
   } 
}
