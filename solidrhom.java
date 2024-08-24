public class solidrhom {
    public static void sold_romb(int n){
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            } 
            // for print*
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        sold_romb(4);
    }
    
    
}
