public class fizzBuzz {
    public static void main(String[] args) {
        fizzing(2);
    }
    public static void fizzing(int input){
        if(input%5==0 && input%3==0){
            System.out.println("FizzBuzz");
        }
        else if (input%5==0){
            System.out.println("Fizz");
        }
        else if(input%3==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(input);
        }

    }
}
