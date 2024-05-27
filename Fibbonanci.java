
public class Fibbonanci {
    public static void main(String[] args) {

        System.out.println("Fibbonanci Series: \n");
        int a = 1;
        int b = 2;
        int c;
        int sum = 2;
        // System.out.println(a);
        // System.out.println(b);

        for (int k = 0; k < 31; k++) {
            c = a + b;
            if (c < 4000000 && c % 2 == 0) {

                sum += c;

            }

            a = b;
            b = c;

        }

        System.out.println(sum);
    }
}
