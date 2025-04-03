import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int primeSum=decimalSum(a,b);
        System.out.print(primeSum);
    }

    public static int decimalSum(int a, int b){
        int sum=0;
        for(int i=a; i<=b; i++){
            if(isPrime(i))
            sum = sum+i;
        }
        return sum;
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false; // Numbers less than 2 are not prime
        }
        
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false; // Not a prime number
            }
        }
        
        return true; // Prime number
    }

}