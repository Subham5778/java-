import java.util.*;
public class Sum {
    public static void binToDec(int binNum){
        int pow =0;
        int decNum = 0;
        while (binNum>0){
            int lastDigit = (binNum % 10);
            decNum =decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("decimal of "+binNum+"="+decNum);
    }    
      
        public static void main(String args[]){
          
            binToDec(111);
            
        } 


}
//     public static int factorial(int n){
//         int f =1;
//         for(int i=1;i<=n;i++){
//             f=f*i;
//         }

//         return f;
        
        
//     }
//     public static int binoCoeff(int n, int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr= factorial(n-r);
//         int binoCoeff = fact_n / (fact_r*fact_nmr);

//         return binoCoeff;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the value of m");
//         int m = sc.nextInt();
//         System.out.println("Enter the value of k");
//         int k =sc.nextInt();
//         System.out.println("binoCoeff : "+binoCoeff(m, k));

//     }   
    
// }
//     // //    int temp =num1;
    // //    num1=num2;
    // //    num2=temp;
             
        
        
    // //     System.out.println("num1="+num1);
    // //     System.out.println("num1="+num2);
    //        int product =num1*num2;
    //        System.out.println("the product of a and b is : " +product);

    // }
    // public static void main(String args[]){
    //     // int num1=5;
    //     // int num2=6;
    //     // Scanner sc = new Scanner(System.in);
    //     // System.out.println("Enter the value a : ");
    //     // int a= sc.nextInt();
    //     // System.out.println("Enter the value b : ");
    //     // int b = sc.nextInt();
    //     Scanner sc =new Scanner(System.in);
    //     System.out.println("Enter the value of a : ");
       
    //     int a =sc.nextInt();
    //     System.out.println("Enter the value of b : ");
    //     int b=sc.nextInt();
    //     print_Sum_val(a,b);
    
    

