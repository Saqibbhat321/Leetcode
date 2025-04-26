import java.beans.Introspector;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeCheck {

    public static boolean IsPrime(int num) {
        if (num <= 1)
            return false;
        
        // Check for divisors from 2 up to the square root of num
        // If num is divisible by any number in this range, it's not prime
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // divisors found therfore Not a Prime
            }
        }
        // No divisors found → the number is prime
        return true;
    }


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 6, 121, 242, 654, 787, 12321, 5, 7, 4, 3);
        for (int i : numbers) {
            if (IsPrime(i)) {
                System.out.println(i + " is a prime number");

            } else System.out.println(i + " is not a prime number");
        }


    }
}
