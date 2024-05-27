import java.util.Scanner;

public class turtle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String output[][] = new String[50][50];
        String moves;

        System.out.printf("Press start to enter is game:\t");
        String start = input.nextLine().toLowerCase();
        int currentRow = 0;
        int currentCol = 0;
        String prevMoves = "";

        if (start.equals("start")) {
            System.out.println("Game Started!!!");
            System.out.println("Enter the move: [UP,Down,left,right___no.of moves]");
        }

        while (true) {
            moves = input.nextLine().toLowerCase();
            String splittedMoves[] = moves.split(" ");
            if (splittedMoves[0].equals("end")) {
                System.out.println("\n\n");
                for (int i = 0; i < output.length; i++) {
                    for (int j = 0; j < output.length; j++) {
                        if (output[i][j] != null) {
                            System.out.printf("%s", output[i][j]);
                        } else {
                            System.out.printf(" ");

                        }
                    }
                    System.out.println(" ");
                }
                break;
            }

            switch (splittedMoves[0]) {
                case "down":
                    // System.out.printf("%d%d\n", currentRow, currentCol);
                    if (prevMoves.equals("right") || prevMoves.equals("left"))
                        currentRow++;

                    for (int i = 0; i < Integer.parseInt(splittedMoves[1]); i++) {
                        output[currentRow][currentCol] = ("*");
                        currentRow++;
                    }
                    currentRow--;
                    prevMoves = "down";
                    System.out.printf("%d%d\n", currentRow, currentCol);

                    break;

                case "right":
                    // System.out.printf("%d%d\n", currentRow, currentCol);
                    if (prevMoves.equals("down") || prevMoves.equals("up"))
                        currentCol++;

                    if (prevMoves.equals("left")) {
                        System.out.println("Cannot move right after left on same line.");
                        break;
                    }

                    for (int k = 0; k < Integer.parseInt(splittedMoves[1]); k++) {
                        output[currentRow][currentCol] = ("*");
                        currentCol++;
                    }
                    currentCol--;
                    prevMoves = "right";
                    System.out.printf("%d%d\n", currentRow, currentCol);
                    break;

                case "left":
                    // System.out.printf("%d%d\n", currentRow, currentCol);
                    if (prevMoves.equals("down") || prevMoves.equals("up"))
                        currentCol--;
                    if (prevMoves.equals("right")) {
                        System.out.println("Cannot move left after right on same line.");
                        break;
                    }
                    for (int k = 0; k < Integer.parseInt(splittedMoves[1]); k--) {
                        output[currentRow][currentCol] = ("*");
                        currentCol--;
                    }
                    currentCol++;
                    prevMoves = "left";
                    System.out.printf("%d%d\n", currentRow, currentCol);

                    break;

                case "up":
                    // System.out.printf("%d%d\n", currentRow, currentCol);
                    if (prevMoves.equals("right") || prevMoves.equals("left"))
                        currentRow--;

                    for (int k = 0; k < Integer.parseInt(splittedMoves[1]); k++) {
                        output[currentRow][currentCol] = ("*");
                        currentRow--;
                    }
                    currentRow++;
                    prevMoves = "up";
                    System.out.printf("%d%d\n", currentRow, currentCol);

                    break;

                default:
                    System.out.println("Please enter Any of these mooves:\n 1. Up \n 2. Down \n 3. Left \n 4. Right");
                    break;
            }
        }

    }
}
