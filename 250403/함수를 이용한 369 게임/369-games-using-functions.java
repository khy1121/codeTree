import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
       
        
        System.out.print(count369(A,B));
        sc.close();
    }

    public static int count369(int A, int B) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (contains369(i) || i % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean contains369(int num) {
        String strNum = Integer.toString(num);
        return strNum.contains("3") || strNum.contains("6") || strNum.contains("9");
    }
}