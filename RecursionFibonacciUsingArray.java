public class RecursionFibonacciUsingArray {

    public static int[] printFib(int currentValue, int n, int[] output) {
      output[currentValue] = output[currentValue - 1] + output[currentValue - 2];
      if(currentValue == 9) {
         return output;
      }
      return printFib(currentValue + 1, n, output);
    }

    public static void main(String [] args){
         int output[] = new int[10];
         output[0] = 0;
         output[1] = 1;
         // output should be an array of length n
         // initial value of output = [0, 1]
        int result[] = printFib(2, 10,  output);
    }
    
}
