import java.util.Scanner;

public class largestArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers []= new int[5];

        System.out.println("Enter five numbers:");

        // Input the numbers
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Find the largest number
        int largest = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
