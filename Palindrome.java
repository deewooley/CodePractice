public class Palindrome {
    public static void main(String[] args) {
        palindrome("Deed");
    }
    public static void palindrome(String reversible){
int charsLength = reversible.length()-1;
String refference="";
String reffVar=reversible.toLowerCase();

       char[] refferenceArray = reffVar.toCharArray();
       for(int i = charsLength; i>=0; i--){
           refference+=refferenceArray[i];
       }

       if(reffVar.equals(refference)){
           System.out.println(true);
       }
       else{
           System.out.println(false);
       }
    }
}
