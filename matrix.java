import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        System.out.println("Enter a value for 2 X 2 matrix A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = input.nextInt();

            }
        }

        System.out.println("Enter a value for 2 X 2 matrix B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = input.nextInt();

            }
        }

        System.out.println("Given matrix A is: \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.printf("\n");
        }

        System.out.println("Given matrix B is: \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.printf("\n");
        }

        // for (int i = 0; i < 2; i++) {
        // for (int j = i; j < 2; j++) {
        // int sum = 0;
        // for (int k = 0; k < 2; k++) {
        // sum += A[j][k] * B[k][j];
        // }

        // C[i][j] = sum;
        // }

        // }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int sum = 0;
                for (int k = 0; k < 2; k++) {
                    sum = sum + (A[i][k] * B[k][j]);
                }

                C[i][j] = sum;
            }

        }

        System.out.println("Multiplication of two matrix is: \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }
}