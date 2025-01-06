package LogicalProgramming;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
    public static int generateRandomNo(int n){
        Random r = new Random();
        return r.nextInt(n)+1; // Generates a random number between 1 and n
    }

    public static int countRandomNo(int n){
        HashSet<Integer> collectedCoupons = new HashSet<>();
        int cnt = 0;
        while(collectedCoupons.size()<n){
            int randonNo = generateRandomNo(n);
            cnt++;
            collectedCoupons.add(randonNo);
        }
        return cnt;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of distinct coupons : ");
        int n = sc.nextInt();
        int totalRandomNo = countRandomNo(n);
        System.out.println("Total random numbers needed to collect all distinct coupons: " + totalRandomNo);
        sc.close();
    }

}
