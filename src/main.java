public class main {
    public static String fizzBuzz(int num){
        if (num % 3 == 0){
            if (num % 5 == 0){
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }
}
