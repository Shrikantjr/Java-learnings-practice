import java.util.Scanner;

public class UserInputUsingScanner {
    public static void main(String [] args) {

        int result;
        char operator;
        
        Scanner sc = new Scanner(System.in);    
        /*String name = sc.next();
        //next function take only toekn 
        // if we want to displayed whoe string like "my name is abcd" so we can use nextline method 
        System.out.println(name);
        */

        //Calculator 
        int a = sc.nextInt();
        int b = sc.nextInt();

         operator = sc.next().charAt(0);

        switch(operator){
            case '+': 
            result = a + b ;
            System.out.println(result);
            break;

            case '-': 
            result = a - b ;
            System.out.println(result);
            break;

            case '*': 
            result = a * b ;
            System.out.println(result);
            break;

            case '/': 
            result = a / b ;
            System.out.println(result);
            break;
            
            default: System.out.println("invalid operator");
        }

    }
}
