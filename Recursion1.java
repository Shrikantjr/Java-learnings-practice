public class Recursion1 {

    public static void printNum(int n) {
        if(n ==6){
            //n ==6 coz we have to rpint till 5 
            return;
        }

        System.out.println(n); // frist getting num and then calling himself/itself fucn for recursion
        printNum(n+1); // coz we are travelling from 1 to 5
        
    }
    
    public static void main(String [] args) {

        //print num from 1 to 5
        int n =1;
        printNum(n);

        
    }
}
