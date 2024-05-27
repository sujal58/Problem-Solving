import java.util.Scanner;

public class hackerRank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of level: ");

        int n = input.nextInt();

        int gap = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < gap) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            gap--;
            System.out.println(" ");
        }
    }
}
