import java.util.Scanner;

public class MonthUsingScanner {
    public static void main(String []args) {

        //month displayed by user input
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1: 
            System.out.println("jan");
            break;

            case 2: 
            System.out.println("feb");
            break;

            case 3: 
            System.out.println("mar");
            break;

            case 4: 
            System.out.println("apr");
            break;
            
            default: System.out.println("invalid operator");
        }

        
    }
    
}
