public class randomNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int c = 5;
        int r = 1;

        for (int i = 0; i < c; i++) {
            r = r * (a + b) % c;
            System.out.println(r);
        }
    }
}
