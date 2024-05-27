import java.util.Scanner;

public class Array {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a size of Array: ");
        int n = input.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the element of Array:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Element of Array:");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "  ");
        }
    }
}
