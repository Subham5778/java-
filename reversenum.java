public class reversenum {
    public static int rev(int numbers){
        while(numbers>0){
            int lastDigit=numbers%10;
            System.out.println(lastDigit);
            numbers/=10;
        }
        return 0;
       
       
    }   
    public static void main(String args[]){
        rev(34678);

    }
    
}
