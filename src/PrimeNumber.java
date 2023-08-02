public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 17;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

//Answer:
//        The PrimeNumber class contains a main method and a static isPrime method to check if a number is prime.
//        The isPrime method takes an int number as input and returns a boolean indicating if it is prime or not.
//        It first checks if number is less than or equal to 1, in which case it immediately returns false, since 1 and 0 are not considered prime numbers.
//        Next, it iterates from 2 to the number itself with a for loop.
//        Inside the loop, it checks if number is exactly divisible by the current iterator value i by checking number % i == 0. If so, it returns false.
//        If the loop completes without finding a factor, it means the number is only divisible by 1 and itself, so it returns true.
//        In the main method, an example number 17 is initialized and passed to the isPrime method.
//        Based on the boolean result, it prints whether 17 is prime or not prime.
//        So this demonstrates how to check for prime numbers in Java - try dividing by all numbers from 2 up to the number itself, and if none divide it evenly, then it is prime.
//        The isPrime method can be reused to test primality for any integer value.

