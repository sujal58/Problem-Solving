import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        String day = input.nextLine();
        int dayInt = 0;
        int date = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(day)) {
                dayInt = i;
                break;
            }
        }

        for (int i = 0; i < days.length; i++) {
            System.out.printf("%s", days[i]);
            System.out.printf("   ");

        }

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < days.length; j++) {
                System.out.printf("%d", (date <= 31 ? ++date : ""));
                System.out.printf("   ");
            }
            System.out.println("");
        }
    }
}
