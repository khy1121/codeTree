import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int min =0; 

        if(a<b) min =a; 
        if (min>c) min=c;

        System.out.print(min);

        
    }
}