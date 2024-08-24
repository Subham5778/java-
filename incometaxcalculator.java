import java.util.*;
public class incometaxcalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        int tax;
        if(a<500000){
            tax = 0;
        }
        else if(a >= 500000 && a<=1000000){
            tax = (int) (a * 0.2);
        }
        else{
            tax = (int) (a * 0.3);
        }
       int b= a-tax;
       System.out.println("after cutting tax your  balance is " + b);

    }
}
    

