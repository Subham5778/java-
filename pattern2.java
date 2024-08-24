import java.util.*;
public class pattern2 {
    public static void hollow_rectangle(int totRows, int totCols) {
        // outer
        for (int i = 1; i <= totRows; i++) {
            // inner
            for (int j = 1; j <= totCols; j++) {
                // cell
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    // spaces inside the rectangle
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows");
        int r = sc.nextInt();
        System.out.println("Enter a number of columns");
        int c = sc.nextInt();
        hollow_rectangle(r, c);
    }
}
