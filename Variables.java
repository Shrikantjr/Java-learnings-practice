

public class Variables {

    public static void main(String []args) {
    //variables
    /*
     * varaibles you can save the value and changes those value and stores in the memory
     * ex., our maths formula (a + b)2 a and b are the variables coz we can change the values
     */
    int a = 10;
    int b = 5;

    int ans = a * b / a - b;
    int ans1 = (a * b) / (a - b);
    /*
     * in java calculation done from left to right
     * mutiplication ,dividation ,module has the greater priority then minus and plus
     */
    System.out.println("ans is: " +ans);
    System.out.println("ans is: " +ans1);
        
    }
    
}
