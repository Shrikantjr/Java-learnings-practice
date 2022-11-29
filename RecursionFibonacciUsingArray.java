public class RecursionFibonacciUsingArray {

    public static int printFib(int n) {
      if(n == 0){
         return 0;
      }

        int[] num = new int[n + 2];
         num [0]= 0;
         num [1] = 1;

         for(int i=2; i<=n; i++){
            num[i] = num[i-1] + num[i-2];
         }
         return num[n];
        
    }

    public static void main(String [] args){
         int n= 10;
        
         for(int i= 0; i< n; i++){
            System.out.print(printFib(i) + " ");
         }
    }
    
}
