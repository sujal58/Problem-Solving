import java.util.Scanner;

public class line {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of coordinate: ");
        int cord = input.nextInt();

        int[] arrX = new int[cord];
        int[] arrY = new int[cord];
        int m = 2;
        int c = 5;

        System.out.println("Enter x-cordinates:");
        for (int i = 0; i < cord; i++) {
            arrX[i] = input.nextInt();

        }

        for (int i = 0; i < cord; i++) {
            arrY[i] = yValue(m, arrX[i], c);

        }

        System.out.print("\nX | ");
        for (int i = 0; i < cord; i++) {
            System.out.printf("%d \t| \t", i);
        }

        System.out.println(" ");

        System.out.print("Y | ");

        for (int i = 0; i < cord; i++) {
            System.out.printf("%d \t| \t", arrY[i]);

        }

    }

    public static int yValue(int m, int x, int c) {
        return m * x + c;
    }

}