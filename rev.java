import java.util.*;

public class rev {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
       
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n/=10;
        }
        
    }
    
}
