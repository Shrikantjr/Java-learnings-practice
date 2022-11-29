public class Recursion {

    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //first printing the given number
        printNum(n-1);
        //recursion means 5-1 =4 , then n um will be 4, then 4-1 =3 so on  it n=0
        //when n =0 it will check oin if condition and return from function to main function
        //number is decreasing by 1
    }
    public static void main(String []args) {

        //q. print num from 5 to 1

        //recursion
        /*
         * Recursion is the technique of making a function call itself. This technique provides a way to break 
         * complicated problems down into simple problems which are easier to solve.
         */

         int n=5;

        //calling the fun
        printNum(n);
        
        //imp note
        //1st main function call the other function then that function will execute
        // and will call itself .. this will go on till base condition statisfied (ie., if condition)
        // the moment that satisfied it will travels back to main function
    }
    
}
