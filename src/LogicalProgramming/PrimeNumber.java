package LogicalProgramming;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("The number is not a Prime Number.");
        } else if (n == 2) {
            System.out.println("2 is a Prime Number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("The number is a Prime Number.");
            } else {
                System.out.println("The number is not a Prime Number.");
            }
        }
        sc.close();
    }
}
