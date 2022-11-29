

public class Recursion3 {
    
    public static int calcfactorial(int n) {
        if(n == 1 || n == 0){
            return 1;
        }

        int fact_first = calcfactorial(n-1);
        int fact = n * fact_first;

        return(fact);
    }

    public static void main(String []args) {

        int n = 5;
        //print factorial of a number n
        int ans =calcfactorial(n);
        System.out.println("Factorial of 5 is: "+ ans);
        
    }
}
