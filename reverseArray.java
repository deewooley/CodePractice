public class reverseArray {
    /*
    Given an Array of any size. Complete the method to swap the position of the first and last elements in the array.
For example if you were given this array
{"A1","B2","C3"};
Swap the positions of the A1 and C3 element so that the array now looks like this  {"C3", "B2", "A1"};
     */

    public static void main(String[] args) {
        String[] intStray = {" Dee ", " E ", " Wool ", "Swagg", "Dabomb", "Turkey"};
        System.out.println(revArray(intStray));
    }

    public static String revArray(String[] inputArray){
        String output = "";

        int finVariable = inputArray.length-1;
        String holder = inputArray[0];
        inputArray[0]=String.valueOf(inputArray[finVariable]);
        inputArray[finVariable]=String.valueOf(holder);


        for(int i = 0; i<=finVariable; i++){
            output+=inputArray[i];
        }
        return output;
    }
}
