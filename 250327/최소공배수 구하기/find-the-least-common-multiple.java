import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int max = 0;
        for(int i=1; i<=n && i<=m; i++){
            if(n%i ==0 && m%i ==0)
                max = i;
        }

        int min = (n*m)/ max;
        System.out.print(min);
    }
}