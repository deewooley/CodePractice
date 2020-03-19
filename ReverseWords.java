public class ReverseWords {

    public static void main(String[] args) {
       reverseString("");
        System.out.println(reverseString("DavinaWooley"));
    }
    public static String reverseString(String reverseThis){
         char[] arrayOfChar = reverseThis.toCharArray();
         String output="";
         for(int i=arrayOfChar.length-1; i>=0; i--){
             output+=arrayOfChar[i];
         }
         return output;
    }
}