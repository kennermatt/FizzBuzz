public class FizzBuzz {
    public static void main(String[] args){
        if(args.length != 3){
            System.err.println("Expected 3 arguments, but got " + args.length);
        } else {
            int fizz = Integer.parseInt(args[0]);
            int buzz = Integer.parseInt(args[1]);
            int upperLimit = Integer.parseInt(args[2]);
            for (int i = 1; i <= upperLimit; i++){
                if (i % fizz == 0){
                    if (i % buzz == 0){
                        System.out.println("FizzBuzz");
                    } else {
                        System.out.println("Fizz");
                    }
                } else if (i % buzz == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
