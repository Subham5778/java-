import java.util.*;
public class foverload {
   public static int sum(int a,int b){
     return a+b;
   }    
   public static int sum(int a, int b,int c){
     return a+b+c;
   }
   public static void main(String args[]){
   /*  System.out.println(sum(5,2));
    System.out.println(sum(2,6,7));*/
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number a");
    int a = sc.nextInt();
    System.out.println("Enter the number b");
    int b =sc.nextInt();
    System.out.println("Enter the number c");
    int c = sc.nextInt();
    System.out.println("a+b =");
    System.out.println(a+b);
    System.out.println("a+b+c =");
    System.out.println(a+b+c);
   }
}
