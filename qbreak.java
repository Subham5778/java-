import java.util.*;

public class qbreak {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if (n % 10 == 0) { // break statement use for break the loop if code is true 
                
                break;
            }
            System.out.println(n);
        }
    }
}
