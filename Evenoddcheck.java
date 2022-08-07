import java.util.Scanner;

public class evenoddcheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==1){
            System.out.println(a + " is a odd no.");
        }else{ System.out.println(a + " is a even  no.");}
    }
    
}
