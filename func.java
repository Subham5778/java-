// public class func {
//    public static void patt(){
//       for (int i =1; i<=4;i++){
//         for(int j =1;j<=i;j++){
//             System.out.print(j);
//         }
//         System.out.println();
//       }
//    }  
//    public static void main(String args[]){
//     patt();
//    }
   
// }
// import java.util.*;
// public class func {
//     public static void calculatesum(){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the value of a"); 
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sum = a+b;
//     int div = a /b;
//     System.out.println(sum);
//     System.out.println(div);


//     }
    
//     public static void main(String args[]){
//         calculatesum();
//     }
// }
// import java.util.*;
// public class func {

//     public static void calculatesum(int num1,int num2){
//         int sum = num1-num2;
//         System.out.println(sum);

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calculatesum(a, b);
//     }
// }

// import java.util.*;
// public class func {
//    public static void swap(int num1,int num2){
//     int tem = num1;
//      num1 = num2;

//      num2 = tem;
//     System.out.println(num1);
//     System.out.println(num2);
//    }
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b= sc.nextInt();
//     swap(a, b);
//    }
// }

// import java.util.*;
// public class func{
//     public static int factorial(int n){
//       int f=1;
//       for (int i=1; i<=n-1+1;i++){
//         f=f*i;
//       }
//       return f;
//     }
    //  public static void main(String args[]){
    //     System.out.println(factorial(4));
    //  }
    



//     public static int bino(int n, int r){
//          int fact_n=factorial(n);
//          int fact_r=factorial(r);
//          int fact_nmr =factorial(n-r);
//          int binocoeff = fact_n/(fact_r*fact_nmr);
//         return binocoeff;
//     }
//     public static void main(String args[]){
//       System.out.println (bino(6, 6));
//     }

    

// }



// import java.util.*;
// public class func{
//    public static int over(int a , int b){
//     int sum = a +b;
//     return sum;
//    }
//    public static int overr(int a , int b, int c){
//     int sum = a+b;
//     int third = sum-c;
//     return third;
//    }


//    public static void main(String args[]){
//       System.out.println(overr(3, 4, 5));
//       System.out.println(over(4, 5));
//    }
// }  

// import java.util.*;
// public class func{
//     public static boolean isprime(int n){
//         boolean isprime=true;
//         for (int i=2;i<=n-1;i++){
//             if(n%i==0){
//                 isprime = false;
//                 break;
//             }

//         }
//         return isprime;
//     }
//     public static void main(String args[]){
//         System.out.println(isprime(1));
//     }

// }

import java.util.*;
public class func{
   public static void bintodec(int binnum){
    int pow = 0;
    int decNum=0;
    while (binnum>0) {
        int lastdigit = binnum%10;
        decNum=decNum+(lastdigit*(int) Math.pow(2, pow));
        pow++;

        binnum= binnum / 10;
        
    }
    System.out.println("decimal of " + binnum + "=" + decNum );
   }
   public static void main(String args[]){
        bintodec(111);
   }
}
