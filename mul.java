public class mul {


    
    public static void main(String []args) {

        String n = "shri";
        String revstr = "";
        for(int i=n.length()-1; i>=0; i--){
            revstr = revstr + n.charAt(i);
        }
        System.err.println(revstr);
    }
}
