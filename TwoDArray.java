import java.util.*;

public class TwoDArray {
    
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        //2d array

        //input
        for(int i=0; i<rows; i++){
            //outer loops control rows
            for(int j=0; j<cols; j++){
                //inner loops control col
                numbers[i][j] =sc.nextInt();
            }
        }

        int x = sc.nextInt();
        //finding the location of given number

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                //comapre with x
                if(numbers[i][j] == x){
                    System.out.println(i + ", " + j);
                }
            }
        }
        /* 
        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        */
    }
}
