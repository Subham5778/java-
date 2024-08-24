import java.util.*;
public class triangle01 {
    public static void triangle_01(int n){
        //outer loop
        for(int i=1; i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if( (i+j)% 2 ==0 ){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                
            }
            System.out.println();

        }

    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of x : ");
       int x = sc.nextInt(); 
        triangle_01(x);
    }
}
