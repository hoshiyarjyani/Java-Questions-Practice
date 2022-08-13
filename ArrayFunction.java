import java.util.Scanner;

public class ArrayFunction{
public static void main(String args[]){
    //For loop for the set length of the array.
System.out.println("set the length of Array");
Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int Marks [] = new int[size];

    //For loop for put input in array
    for(int n=0; n<size;n++){
        Marks[n] = sc.nextInt();
    }
    // for lopp for show output in array
    for(int n=0; n<size; n++ ){
      System.out.print(Marks[n]+" ");
    }
}
} 
