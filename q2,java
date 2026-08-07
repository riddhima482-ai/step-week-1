import java.util.Scanner;

public class TypingAccuracyChecker {

    static void checkTypingAccuracy(String original, String typed) {
        int total = original.length();
        int matched = 0;
        int firstMismatchPos = -1; // 1-based position
        char origChar = ' ', typedChar = ' ';

        for (int i = 0; i < total; i++) {
            char o = original.charAt(i);
            char t = typed.charAt(i);
            if (o == t) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1; // convert to 1-based position
                origChar = o;
                typedChar = t;
            }
        }

        double accuracy = ((double) matched / total) * 100;

        StringBuilder result = new StringBuilder();
        result.append("Matched: ").append(matched).append("/").append(total)
              .append(" | Accuracy: ").append(String.format("%.2f", accuracy)).append("%");

        if (firstMismatchPos == -1) {
            result.append(" | No Mismatches");
        } else {
            result.append(" | First Mismatch at position ").append(firstMismatchPos)
                  .append(" ('").append(origChar).append("' vs '").append(typedChar).append("')");
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original passage: ");
        String original = sc.nextLine();

        System.out.print("Enter the typed text: ");
        String typed = sc.nextLine();

        if (original.length() != typed.length()) {
            System.out.println("Error: both strings must be of equal length.");
        } else {
            checkTypingAccuracy(original, typed);
        }

        sc.close();
    }
}
