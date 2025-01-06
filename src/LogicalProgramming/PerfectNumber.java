package LogicalProgramming;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int check = 0;

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        }else {
            check = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    check += i;
                }
            }
            if (check == n) {
                System.out.println("The given number is a Perfect Number.");
            } else {
                System.out.println("The given number is not a Perfect Number.");
            }
        }
        sc.close();
    }
}
