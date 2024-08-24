import java.util.*;
public class passfail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String type = (a>=33) ? "pass" : "fail";
        System.out.println(type);
    }

    
}
