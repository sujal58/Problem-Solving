import java.util.*;
import java.time.*;

public class datecompare {
    public static HashMap<Integer, String> numberWord = new HashMap<>();

    public static void main(String[] args) {
        modifyHash();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-mm-dd):");
        String userInput = input.nextLine();
        String[] splittedDate = userInput.split("-");

        int userYear = Integer.parseInt(splittedDate[0]);
        int userMonth = Integer.parseInt(splittedDate[1]);
        int userDay = Integer.parseInt(splittedDate[2]);

        LocalDate date = LocalDate.now();

        LocalDate userDate = LocalDate.of(userYear, userMonth, userDay);

        int yearDiff = date.getYear() - userDate.getYear();
        int monthDiff = date.getMonthValue() - userDate.getMonthValue();
        int dayDiff = date.getDayOfMonth() - userDate.getDayOfMonth();

        int totaldaydiff = yearDiff * 365 + monthDiff * 30 + dayDiff;
        if (totaldaydiff > 365) {
            System.out.printf("%s years Ago.", numberWord.get(totaldaydiff / 365));
        } else if (totaldaydiff < 365 && totaldaydiff >= 30) {
            System.out.printf("%s month Ago.", numberWord.get(totaldaydiff / 30));
        } else if (totaldaydiff < 30 && totaldaydiff > 7) {
            System.out.printf("%s week Ago.", numberWord.get(totaldaydiff / 7));
        } else {
            System.out.printf("%s days Ago.", numberWord.get(totaldaydiff));

        }

    }

    public static void modifyHash() {
        numberWord.put(1, "A");
        numberWord.put(2, "Two");
        numberWord.put(3, "Three");
        numberWord.put(4, "Four");
        numberWord.put(5, "Five");
        numberWord.put(6, "Six");
        numberWord.put(7, "Seven");
        numberWord.put(8, "Eight");
        numberWord.put(9, "Nine");
        numberWord.put(10, "Ten");
    }
}
