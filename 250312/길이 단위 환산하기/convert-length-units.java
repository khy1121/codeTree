import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);

        double ft = sc.nextDouble();
        System.out.printf( "%.1f", 30.48*ft);
    }
}