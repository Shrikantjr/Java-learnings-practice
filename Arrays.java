import java.util.Scanner;

public class Arrays {

    public static void main(String [] args) {

        // first way of doing array 
        int[] marks = new int[3];
        marks[0] = 90;
        marks[1] = 91;
        marks[2] = 92;

        /*
         * one more way to define the array when we know the values 
         * ie., int marks[] = {90, 91, 92};
         */

        for(int i =0; i<3; i++){
            System.out.println("marks in subjects are follows: " + marks[i]);
        }

        System.out.println("----------------------------------------");

        // now lets take value from user 9ie., using scanner class 
        //and add it to array and print using for loop

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //first input from user will define the size of array in num variable

        int num[] = new int[size];

        //below loop for adding the values in array from user2
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        
        //below loop for printing the values
        for(int i=0; i<size; i++){
            System.out.println("numbers are: "+ num[i]);
            //once we take the size (ex., 2) of array from user it will 
            //displayed the values in num varaibles are 0,0 (default or nulll values)
        }


    }
    
}
