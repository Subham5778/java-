import java.util.*;

public class sumn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;
           
        }
        System.out.print("sum of n number is " + sum);  
    } 
    
}
