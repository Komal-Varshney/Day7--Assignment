package LogicalProgramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to find series");
        int n = sc.nextInt();

        System.out.println("The fibonacci series is : ");
        for(int i=0; i<n; i++){
            System.out.print(fib(i)+ " ");
        }
    }

    public static int fib(int n){
        if(n==0 || n==1) return n;
        return fib(n-1)+fib(n-2);
    }
}
