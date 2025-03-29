import java.util.Scanner;

public class Prime_Interval {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false; // 0 and 1 are not prime
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to count prime numbers in a given range
    public static int countPrimes(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for range
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        // Count and display prime numbers
        int primeCount = countPrimes(start, end);
        System.out.println("Total prime numbers between " + start + " and " + end + ": " + primeCount);

        scanner.close();
    }
}
