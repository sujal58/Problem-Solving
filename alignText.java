import java.util.Scanner;

public class alignText {
    // public static int spaceCount(int length) {

    // }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String[] poem = {
                "Mary had a little lamb",
                "His fleece was white as snow, yeah",
                "And everywhere the child went",
                "That little lamb was sure to go, yeah",
                "He followed her to school one day",
                "And broke the teacher's rule",
                "But what a time did they have",
                "That day at school",
                "Tisket! Tasket! Baby",
                "A green and yellow basket",
                "Sent a letter to my baby",
                "And on my way I passed it"
        };
        int max = 0;
        int[] wordCount = new int[poem.length];
        for (int i = 0; i < poem.length; i++) {
            if (max < poem[i].length()) {
                max = poem[i].length();
            }
            int wordcount = 1;
            for (int j = 0; j < poem[i].length(); j++) {
                if (poem[i].charAt(j) == ' ') {
                    wordcount += 1;
                }

            }
            wordCount[i] = wordcount;

            // System.out.printf("No of words of %d line is: %d \n", i, wordcount);
            // System.out.println(wordCount[i]);

        }
        // System.out.println(max);
        System.out.printf("Where to justify? Left or Center or Right or Justify : ");
        String align = input.nextLine();

        for (int i = 0; i < poem.length; i++) {
            int requiredExtraSpace = max - poem[i].length();

            if (requiredExtraSpace > 0) {
                String spaces = " ";
                // System.out.println(requiredExtraSpace);
                if (align.equals("Right")) {
                    for (int j = 1; j <= requiredExtraSpace; j++) {
                        spaces += " ";
                    }
                    poem[i] = spaces + poem[i];
                } else if (align.equals("Center")) {
                    for (int j = 1; j <= requiredExtraSpace / 2; j++) {
                        spaces += " ";
                    }
                    poem[i] = spaces + poem[i] + spaces;
                } else if (align.equals("Left")) {
                    poem[i] = poem[i] + spaces;
                } else if (align.equals("Justify")) {
                    int trimSpacesCount = requiredExtraSpace / (wordCount[i] - 1);
                    // System.out.println(trimSpacesCount);
                    int remainderSpaceCount = requiredExtraSpace % (wordCount[i] - 1);
                    // System.out.println(remainderSpaceCount);
                    if (requiredExtraSpace % wordCount[i] != 0) {
                        // System.out.println("Remainder exist!!!!");
                    }
                    String trimSpaces = " ";
                    for (int j = 1; j <= trimSpacesCount; j++) {
                        trimSpaces += " ";
                    }

                    String splittedWord[] = poem[i].split(" ");
                    String line = "";

                    for (int k = 0; k < splittedWord.length; k++) {

                        if (k == splittedWord.length - 1) {
                            line += splittedWord[k];
                            break;
                        }
                        line += splittedWord[k] + trimSpaces + (remainderSpaceCount > 0 ? " " : "");

                        remainderSpaceCount--;

                    }

                    poem[i] = line;
                }

            }

            System.out.println(poem[i]);

        }

    }

}
