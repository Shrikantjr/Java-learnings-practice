public class Recursion2 {

    public static void printSum(int i ,int n, int sum) {
        if(i == n){
            sum += i;
        System.out.println(sum);
            return;
        }
        sum +=i; // stating sum is 1 then we are adding i and so on..
        printSum(i+1, n, sum); // i+1 coz i is going to inrecase 

        
    }
    
    public static void main(String[]args) {

        //print sum of 1st n natural numbers
        

        printSum(1, 5, 0);

        
    }
}
