import java.util.Scanner;

public class findXinTwoDarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter rows");
        int rows = sc.nextInt();

        System.out.println("please enter colums");
        int cols = sc.nextInt();
        
        System.out.println("enter the matrix values with space");
        // 2D array

        int matrix[][] = new int[rows][cols];

        // Taking Input in 2D array

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // any random no. given by user for find hisposition in 2D array Matrix

        System.out.println("choose any no from the matrix to find out his position in array");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] == x){
                    System.out.println("x is found at location (" +i+","+j+")");
                }
                }
            } sc.close();
        }
    }


