/**
 * Created by: Matthew Kenner 1/27/2022
 * CS251 Lab01 - FizzBuzz
 *
 * The following program writes Fizz and Buzz for each multiple of
 * whatever the user inputs.
 * To use this program follow this guideline in terminal:
 *     javac FizzBuzz.java
 *     java FizzBuzz 3 5 100
 *
 * class FizzBuzz
 *  This method requires the user to input 3 numbers in terminal:
 *  1st number is the first multiple fizz
 *  2nd number is the second multiple buzz
 *  3rd number is the upper limit of the program
 *
 *  The program then checks to see if the current number is a multiple
 *  of the 1st or 2nd number and writes Fizz or Buzz respectively.
 *
 *  The program terminates when the upper limit has been reached.
 *  return void
 */
public class FizzBuzz {
    public static void main(String[] args){
        if(args.length != 3){
            System.err.println("Expected 3 arguments, but got " + args.length);
        } else {
            int fizz = Integer.parseInt(args[0]);
            int buzz = Integer.parseInt(args[1]);
            int upperLimit = Integer.parseInt(args[2]);
            for (int j = 1; j <= upperLimit; j++){
                if (j % fizz == 0){
                    if (j % buzz == 0){
                        System.out.println("FizzBuzz");
                    } else {
                        System.out.println("Fizz");
                    }
                } else if (j % buzz == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(j);
                }
            }
        }
    }
}
