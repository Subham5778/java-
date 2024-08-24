import java.util.*;
public class prodf {
    public static void  product(){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of a:");
      int a = sc.nextInt();
      System.out.println("Enter the value of b:");
      int b = sc.nextInt();
      int prod = a*b;
      System.out.println("the product value is :");
      System.out.println(prod);
    }
    public static void main(String args[]){
        product();

    }
    
}
