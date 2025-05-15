import java.util.Scanner;

public class GreaterThanPrevious {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input: size of array
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Input: array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 1; // First element is always counted
            int max = arr[0]; // Track max so far

            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    count++;
                    max = arr[i]; // Update max if current element is greater
                }
            }

            // Output the count
            System.out.println(count);
        }
    }
