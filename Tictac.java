public class Tictac {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    if (j % 2 != 0) {
                        System.out.printf("|");
                    }
                    if (j % 2 == 0) {
                        System.out.printf("--");
                    }
                }
            }

            System.out.println("");

        }
    }
}
