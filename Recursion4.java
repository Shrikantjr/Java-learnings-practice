public class Recursion4 {

    public static void printFib(int a, int b, int n) {
        
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.print(" " + c);
        n = n -1;
        printFib(b, c, n);
        
    }
    

    public static void main(String []args) {
            int a = 0; 
            int b = 1;
            int n =10;

            System.out.print(a + " " + b);
            printFib(a, b, n-2);

        
    }
}
