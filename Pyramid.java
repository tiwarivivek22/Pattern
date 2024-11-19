public class Pyramid {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            // Step 1: Print empty spaces
            for (int j = 0; j < (N - i); j++) {
                System.out.print("  "); // Adjust spacing to align pyramid
            }
            
            // Step 2: Print numbers
            int number = 1;
            boolean increasing = true;
            while (number > 0) {
                System.out.print(number + " ");
                if (number == i) {
                    increasing = false;
                }
                if (increasing) {
                    number++;
                } else {
                    number--;
                }
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
