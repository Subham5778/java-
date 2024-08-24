import java.util.*;
public class buts {
    // for first half
    public static void butts_fl(int n){
        // for printing star 
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            // for spaces
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");

            }
            // for printing star
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for second half
        for (int i=n;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");

            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        butts_fl(k);
    }
    
}
