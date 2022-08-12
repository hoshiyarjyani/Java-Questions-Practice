import java.util.Scanner;

//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

public class voteeligiblity{
    public static void vote(int a){
        if(a>=18){
            System.out.println("Eligible for vote");
        }else{
            System.out.println("not elegible for the vote ...abhi partiksha kro");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        vote(a);
    }
}