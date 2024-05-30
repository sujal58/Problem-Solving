import java.util.Scanner;

public class Tictac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean user1 = true;
        boolean user2 = false;
        String player = "Player 1";

        String tictac[] = new String[9];

        for (int i = 0; i < tictac.length; i++) {
            tictac[i] = "-";
        }

        for (int i = 0; i < 9; i++) {
            player = (user1 == true ? "Player 1" : "Player 2");
            System.out.printf("Please enter a position (1-9) %s: ", player);
            int position;

            do {
                while (!input.hasNextInt()) {
                    System.out.println("Error: Invalid input");
                    input.next();
                }
                position = input.nextInt();
                if (position > 9) {
                    System.out.println("Error: Please Enter a position between 1-9");
                }
                if (tictac[position].equals("x") && tictac[position].equals("0")) {
                    System.out.println("already filled!!");
                }
            } while (position > 9);

            boolean winner = false;

            if (user1) {
                tictac[position - 1] = "X";
                winner = checkWinnerA(tictac);
                if (winner) {
                    System.out.println("A won the game !");
                    System.out.println("Congratulation");
                    printTictac(tictac);
                    break;
                }
                printTictac(tictac);
                user1 = false;
                user2 = true;
            } else {
                tictac[position - 1] = "O";
                winner = checkWinnerB(tictac);
                if (winner) {
                    System.out.println("B won the game !");
                    System.out.println("Congratulation");
                    printTictac(tictac);
                    break;
                }
                printTictac(tictac);
                user2 = false;
                user1 = true;
                // printTictac(tictac);
            }
        }
        // if (!winner) {
        // System.out.println("Game Draw !!!");
        // }

    }

    public static void printTictac(String tictac[]) {

        for (int j = 0; j < 25; j++) {
            System.out.printf("-");
        }
        System.out.println();

        for (int i = 0; i < 9; i++) {
            if (i == 3 || i == 6) {
                System.out.println();
                for (int j = 0; j < 25; j++) {
                    System.out.printf("-");
                }
                System.out.println();
            }
            if (tictac[i] != null) {
                if (i == 0 || i == 3 || i == 6) {
                    System.out.printf("|  %s\t|", tictac[i]);
                } else
                    System.out.printf("  %s\t|", tictac[i]);
            } else {
                System.out.printf("  -\t");
            }
        }

        System.out.println();
        for (int j = 0; j < 25; j++) {
            System.out.printf("-");
        }
        System.out.println(" ");

    }

    public static boolean checkWinnerA(String tictac[]) {
        boolean winner = false;
        if (tictac[0].equals("X") && tictac[1].equals("X") && tictac[2].equals("X")) {
            winner = true;
        } else if (tictac[3].equals("X") && tictac[4].equals("X") && tictac[5].equals("X")) {
            winner = true;
        } else if (tictac[6].equals("X") && tictac[7].equals("X") && tictac[8].equals("X")) {
            winner = true;
        } else if (tictac[0].equals("X") && tictac[3].equals("X") && tictac[6].equals("X")) {
            winner = true;
        } else if (tictac[1].equals("X") && tictac[4].equals("X") && tictac[7].equals("X")) {
            winner = true;
        } else if (tictac[2].equals("X") && tictac[5].equals("X") && tictac[8].equals("X")) {
            winner = true;
        }

        return winner;
    }

    public static boolean checkWinnerB(String tictac[]) {
        boolean winner = false;
        if (tictac[0].equals("O") && tictac[1].equals("O") && tictac[2].equals("O")) {
            winner = true;
        } else if (tictac[3].equals("O") && tictac[4].equals("O") && tictac[5].equals("O")) {
            winner = true;
        } else if (tictac[6].equals("O") && tictac[7].equals("O") && tictac[8].equals("O")) {
            winner = true;
        } else if (tictac[0].equals("O") && tictac[3].equals("O") && tictac[6].equals("O")) {
            winner = true;
        } else if (tictac[1].equals("O") && tictac[4].equals("O") && tictac[7].equals("O")) {
            winner = true;
        } else if (tictac[2].equals("O") && tictac[5].equals("O") && tictac[8].equals("O")) {
            winner = true;
        }

        return winner;
    }
}
