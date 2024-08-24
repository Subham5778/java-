import java.util.*;
public class flrev {
    public static void main(String args[]){

    
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the value of n");
      int n = sc.nextInt();
      for(  ;n>0;n/=10){
        int lastdigit = n%10;
         System.out.print(lastdigit);
       }

    }
}
