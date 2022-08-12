import java.util.Scanner;

//Ques. - Write a program to enter the numbers till the user wants and 
//at the end it should display the count of positive, negative and zeros entered. 

public class CalculatetheNumbers {
   public static void main(String[] args) {
      int positive = 0, negetive = 0, zero = 0;
      System.out.println("Print 1 to continue & 0 to stop");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      while (n == 1) {
         System.out.println("Enter your no.: ");
         int number = sc.nextInt();
         if (number > 0) {
            positive++;
         } else if (number < 0) {
            negetive++;
         } else {
            zero++;
         }
         System.out.println("Print 1 to continue & 0 to stop");
         n = sc.nextInt();
      }
      
      System.out.println("positive no. are " + positive);
      System.out.println("negetive no. are " + negetive);
      System.out.println("zeros are " + zero);
   }
}

