public class fliprev {
    public static void main(String args[]){
        int n = 6768;
        while(n>0){
           int lastdigit = n % 10; 
            System.out.print(lastdigit );
            n/=10;

        }
        System.out.println();

    } 
    
}
