import java.util.*;
public class checkprime {
  public static boolean isprime(int n){
    boolean isprime =true;
    for(int i=2;i<n-1;i++){
        if (n%i==0){
            isprime =false;
            break;

        }
    }
   return isprime;
  } 
  public static void main(String args[]){
   // System.out.println(isprime(5));
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   System.out.println(isprime(n));
  }   
}
