import java.util.*;

public class StringBuilderExample {
    public static void main(String []arg) {
        StringBuilder sb=new StringBuilder("shri");  
        //finding character at given index
        System.out.println(((CharSequence) sb).charAt(0));

        System.out.println("------------------------------");
        //set char at index
        sb.setCharAt(0, 'p');
        System.out.println(sb + ": " +"chaged the char at 0 index");

        System.out.println("------------------------------");

        //insert functions
        //ex., i want to add char A at zero index and shift the "shri" string position to next
        // initial string is "shri" after adding A it should be "Ashri"

        sb.insert(0, 'A');
        System.out.println(sb);

        System.out.println("------------------------------");

        //delete
        //note the ending index is just giving for reference (ie., it will delete at index 0,0 not 0,1)
        sb.delete(1, 2);
        System.out.println(sb);

        System.out.println("------------------------------");

        //append means joing at the end of given string
        sb.append("a");
        System.out.println(sb);

        System.out.println("------------------------------");
        
        //reversing the string using 
        String str1 = "shrikant";
        StringBuilder str = new StringBuilder();
        str.append(str1);
        str.reverse();
        System.out.println("reverse: "+ str);

        System.out.println("------------------------------");   

        //using for loop reversing the string using 
        StringBuilder st5 = new StringBuilder("shri");

        for(int i=0; i<st5.length()/2; i++){
            int front = i;
            int back = st5.length() -1 -i;
            //5 - 1-0 = 4

            char frontChar = st5.charAt(front);
            char backChar = st5.charAt(back);

            st5.setCharAt(front, backChar);
            st5.setCharAt(back, frontChar);
        }
        System.out.println("reverse: "+ st5);
        

        System.out.println("------------------------------");  

    }
}
