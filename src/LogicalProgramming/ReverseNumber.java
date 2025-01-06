package LogicalProgramming;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int ans = 0;
        int i = 10;

        while(n!=0){
            ans= ans*i + n%10;
            n/=10;
        }
        System.out.println("Reversed number: " + ans);
        sc.close();
    }
}
