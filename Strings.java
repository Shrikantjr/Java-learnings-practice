public class Strings {

    public static void main(String []args) {

        //concatenation joing the two string
        String firstName = "Shrikant";
        String lastName = "Devkamble";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println("---------------------------");
        System.out.println(fullName.length());
        System.out.println("---------------------------");
        //finding length using function length

        //printing the caracter like s h r i k a n t
        //will using function charAt (WHENEVER WE ARE USING charAt will use loop to displayed)

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));

        }
        System.out.println("---------------------------");

        System.out.println(fullName.charAt(4));

        System.out.println("---------------------------");

        //will use compare 
        String str = "hello";
        String str1 = "hello";

        //comapre conditions
        //1 s1 > s2 : will give +ve value
        //2 s1 = s2 : will give zero value
        //1 s1 < s2 : will give -ve value
        if(str.compareTo(str1) == 0){
            System.out.println("matched");
        }else{
            System.out.println("not matched");
        }

        System.out.println("---------------------------");

        //will use compare 
        String str3 = "hello";
        String str4 = "wello";

        //comapre conditions
        //1 s1 > s2 : will give +ve value
        //2 s1 = s2 : will give zero value
        //1 s1 < s2 : will give -ve value
        if(str3.compareTo(str4) > 0){
            System.out.println("greater");
        }else{
            System.out.println(" not greater");
            //here it will print no greater coz when to do compare hello & wello w is greater than h
        }

        System.out.println("---------------------------");

        //substring
        String str6 = "This is Shrikant";
        String name = str6.substring(8, str6.length());
        System.out.println(name);

        System.out.println("---------------------------");

        //reverse string
        String strrr = "This is Shrikant", reversestr = "";
        
        for(int i=0; i<strrr.length(); i++){
            reversestr = strrr.charAt(i) + reversestr;
        }

        System.out.println(reversestr);
        
        
        
    }
    
}
