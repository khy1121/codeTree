import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int max =1;
        if(n>m) max =n;
        else max =m;
        int a=1;

        for(int i=1; i<=max; i++){
            if(n%i ==0 && m%i==0){
                a=i;
            }
        }
        System.out.print(a);
        
        
    }
}