import java.util.*;

public class primeinrange {

    public static boolean isprime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) { // Changed the loop condition
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void primeinrang(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " "); // Removed the extra quotes
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeinrang(n);
    }
}
