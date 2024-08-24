public class solidrhomb {
    public static void solid_rhonbus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");

            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        solid_rhonbus(5);
    }
    
}
