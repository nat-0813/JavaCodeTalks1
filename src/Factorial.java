public class Factorial {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

//Answer:
//The Factorial class contains a main method and a static factorial method to calculate factorials.
//        The factorial method takes an integer n as input and calculates the factorial value of n.
//        It initializes a result variable to 1. Then it loops from 1 to n, multiplying the result by each number.
//        For example, if n is 5, it will calculate:
//        result = 1 result = 1 * 1 = 1 result = 1 * 2 = 2
//        result = 2 * 3 = 6 result = 6 * 4 = 24 result = 24 * 5 = 120
//        So it builds up the factorial value iteratively by multiplying the previous result by each sequential number.
//        The result is returned after the loop completes.
//        In the main method, a number variable is initialized to 5.
//        The factorial method is called, passing number as the input. It will compute 5! = 120.
//        The result is stored in the result variable and printed out.
//        So this demonstrates a simple factorial calculation in Java using a loop and static method. The factorial method can be reused for any input number.

