import java.util.*;
public class invertedhalfrotpyr {
    public static void half_rot_pyra(int n){
       //outer loop
       for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");

        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");

            

        }
        System.out.println();


       }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number :");
        int x = sc.nextInt();
        half_rot_pyra(x);
    }
}
