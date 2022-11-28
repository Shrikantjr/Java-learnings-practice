public class Patterns {
    public static void main(String [] args) {

        //pattern 1
        // ****
        // *  * 
        // *  *
        // ****
        int n =4;

        for(int i =1; i<=n;i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                    //checking i & j = to 1 & n coz those are the edge * of the pattern 
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        System.out.println("            ");
        System.out.println("next code pattern 2");
        System.out.println("            ");

        //pattern 2
        // ****
        //  ** 
        //  **
        // ****
        int x =4;

        for(int i =1; i<=x; i++){
            for(int j=1; j<=x; j++){
                if(i== 2 || j== 2 || i==3 || j==3){
                    //here i & j = to 2 & 3 position of pattern 
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("            ");
        System.out.println("next code pattern 3");
        System.out.println("            ");

        //pattern 3
        // *
        // ** 
        // ***
        // ****
        int a =4;

        for(int i=1; i<=a; i++){
            //here i start with 1 to a
            for(int j=1; j<=i; j++){
                //here j start with 1 to i
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("            ");
        System.out.println("next code pattern 4");
        System.out.println("            ");


        //pattern 4
        // ****
        // *** 
        // **
        // *
        int b =4;

        for(int i=b; i>=1; i--){
            //as the pattern is reverse so used reverse loop
            //i.e., i b to 1
            for(int j=1; j<=i; j++){
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("            ");
        System.out.println("next code pattern 5");
        System.out.println("            ");
    
    //pattern 5
        // *
        // ** 
        // ***
        // ****
        // ***
        // **
        // * 
        int c =4;

        for(int i=1; i<=c; i++){
            for(int j=1; j<=i; j++){
                System.out.print("x");
            }
            System.out.println();
        }
        for(int i=c; i>=1; i--){
            for(int j=1; j<i; j++){
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("            ");
        System.out.println("next code pattern 6");
        System.out.println("            ");
    
    //pattern 6
        //    *
        //   ** 
        //  ***
        // ****
        int l =4;

        for(int i=1; i<=l; i++){
            for(int j=1; j<=l-i; j++){
                //the condition is j<=l-i coz we have spaces at start and * at last
                //first inner loop is printing the spaces
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                //first inner loop is printing the *
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("            ");
        System.out.println("next code pattern 7");
        System.out.println("            ");
    
    //pattern 7
        //    *
        //   ** 
        //  ***
        // ****
        //  ***
        //   **
        //    *

        int k =4;

        for(int i=1; i<=k; i++){
            for(int j=1; j<=k-i; j++){
                    System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                    System.out.print("x");
            }
            System.out.println();
        }
        for(int i=k; i>=1; i--){
            //here we start the outer loop with i=k to 1 and 
            //check i should be greater than 1 and do minus ie., revers printing
            for(int j=1; j<=k-i; j++){
                    System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                    System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("            ");
        System.out.println("next code pattern 8");
        System.out.println("            ");
    
    //pattern 8
        //  1
        //  12
        //  123
        //  1234
        int o =4;

        for(int i=1; i<=o; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        
        System.out.println("            ");
        System.out.println("next code pattern 9");
        System.out.println("            ");
    
    //pattern 9
        //  1
        //  23
        //  456
        //  78910
        int p =4;
        int num = 1;

        for(int i=1; i<=p; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

        System.out.println("            ");
        System.out.println("next code pattern 10");
        System.out.println("            ");
    
    //pattern 10
        //  1
        //  01
        //  101
        //  0101
        int v =4;

        for(int i=1; i<=v; i++){
            for(int j= 1; j<=i; j++){
                int sum = i + j ;
                if(sum % 2== 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }

        System.out.println("            ");
        System.out.println("next code Advance pattern 11");
        System.out.println("            ");
    
    //Advance pattern butterfly 11
        //x      x
        //xx    xx
        //xxx  xxx
        //xxxxxxxx
        //xxxxxxxx
        //xxx  xxx
        //xx    xx
        //x      x

        int q =4;

        for(int i=1; i<=q; i++){
            for(int j=1; j<=i; j++){
                    System.out.print("x");
            }
            for(int j=1; j<=2*(q-i); j++){
                //2*(q-i) 2 is used coz spaces in multiple of 2 ie., 2,4,6
                System.out.print(" ");
        }
            for(int j=1; j<=i; j++){
                    System.out.print("x");
            }
            System.out.println();
        }
        for(int i=q; i>=1; i--){
            for(int j=1; j<=i; j++){
                    System.out.print("x");
            }
            for(int j=1; j<=2*(q-i); j++){
                System.out.print(" ");
        }
            for(int j=1; j<=i; j++){
                    System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("            ");
        System.out.println("next code Advance pattern 12");
        System.out.println("            ");
    
    //Advance pattern butterfly 12
        //    *****
        //   *****
        //  *****
        // *****
        //*****
        
        int m =5;

        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i; j++){
                    System.out.print(" ");
            }
                  System.out.print(" ");
            for(int j=1; j<=5; j++){
                // star is fix ie., 5
                    System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("            ");
        System.out.println("next code Advance number pyramid 13");
        System.out.println("            ");
    
    //Advance pattern butterfly 13
        //   1  
        //  2 2  
        // 3 3 3
    //    4 4 4 4
    //   5 5 5 5 5
        
        int u =5;

        for(int i=1; i<=u; i++){
            for(int j=1; j<=u-i; j++){
                    System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
                //printing i coz i is represents row no and it is printing row no of times
                //printing spaces along with number so the pyramid will displayed correct
        }
            System.out.println();
        }
        
        System.out.println("            ");
        System.out.println("next code Advance palindrome 15");
        System.out.println("            ");
    
    //Advance pattern palindrome 15
        //    1  
        //  2 1 2  
        //3 2 1 2 3
    //  4 3 2 1 2 3 4
    //5 4 3 2 1 2 3 4 5 

        int r =5;

        for(int i=1; i<=r; i++){
            for(int j=1; j<=u-i; j++){
                //spaces n -i
                    System.out.print(" ");
            }
            //1st half numbers
            //reverse loop
            for(int j=i; j>=1; j--){
                System.out.print(j);
        }
        //2nd half numbers
            for(int j=2; j<=i; j++){
                System.out.print(j);
        }
            System.out.println();
        }
        
}
}

