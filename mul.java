public class mul {

    
    public static void printNum(int i, int n, int sum) {
        if(i == n ){
            sum +=i;
            System.out.println(sum);
            return;
        }
        
        sum += i;
        printNum(i+1, n, sum);
    }
    
    
    public static void main(String []args) {

        int n= 5;

       printNum(1, 5, 0);
            
        }


    }

