import java.util.*;

public class numbpyra {
   public static void inveted_half_pyr_num(int n){
     //outer loop
     for(int i=1;i<=n;i++){
        //number
        for(int j=1;j<=n-i+1;j++){

               System.out.print(j+"");
        }
          System.out.println();
     }

   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of x :");
    int x = sc.nextInt(); 
    inveted_half_pyr_num(x);
   }
   
}
