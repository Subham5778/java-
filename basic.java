import java.util.*;
public class basic {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the value of n");
        // int n = sc.nextInt();
        // int count = 1;
        // while(count<=n){
        //     System.out.println(count + " ");
        //     count++;
        // }  
        // for(int range=1;range<=n;range++){
        //    System.out.println("hello");
        // }

        // int start =1;
        // do{
        //     System.out.println("jai shree ram");
        //     start++;
        // }while(start<=n);

        // System.out.println("Enter the value of n ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int i=1;
        // while (i<=n){
        //     sum+=i;
        //     i++;
         
        // }
        // System.out.println("sum of number is" + sum);
        //   System.out.println("Enter the value of n");
        //  int n = sc.nextInt();

        // for(int line=1;line<=n;line++){
        //     System.out.println("****");
        // }

        // System.out.println("Enter the value of n: ");
        // int n = sc.nextInt();
        // for(;n>0;){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit);
        //     n/=10;
        // }

        // do{
        //     System.out.println("Enter the number");
        //     int n=sc.nextInt();
        //     if(n%10==0){
        //       break;
        //     }
        //     System.out.println(n);
        // }while(true);

    //     int n = sc.nextInt();
    //     if(n==2){
    //         System.out.println("n is prime ");
    //     }else{
    //         boolean isprime = true;
    //         for(int i=2;i<=n-1;i++){
    //             if(n%i==0){
    //                 isprime=false;
    //             }
    //         }
        

    //     if( isprime == true){
    //     System.out.println("n is prime");
    //     }else{
    //         System.out.println("n is not a prime");
    //     }
    // }


//     int n = sc.nextInt();
//    for(int i =1;i<=n;i++){
//     for(int star=1;star<=n-i+1;star++){
//         System.out.print("*");

//     }
//     System.out.println();
//    }

  System.out.println("Enter a number ");
  int n = sc.nextInt();
  char ch ='A';
  for (int line=1;line<=n;line++ ){
    for(int chars=1;chars<=line;chars++){
        System.out.print(ch);
        ch++;

    }
    System.out.println();
  }



    }
    
}
