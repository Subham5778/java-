import java.io.*;

class LinearStringSearch {
    String array[] = new String[10];

    public void linearSearch(String string[], String search) {
        // Iterate through the array
        for (int i = 0; i < 10; i++) {
            if (search.equals(string[i])) {
                System.out.println("Word found at position " + (i + 1));
                return;
            }
        }
        System.out.println("Word not found.");
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinearStringSearch obj = new LinearStringSearch();

        System.out.println("Enter any 10 words:");
        String enter[] = new String[10];
        for (int i = 0; i < 10; i++) {
            enter[i] = br.readLine();
        }

        System.out.println("Enter the word to be searched:");
        String search1 = br.readLine();
        obj.linearSearch(enter, search1);
    }
}
