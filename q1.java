import java.util.Scanner;

public class SeatDuplicationChecker {

    // Compares every seat number against every other seat number using
    // nested loops only (no Collections class allowed).
    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean[] alreadyReported = new boolean[seatNumbers.length];
        boolean foundAny = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            if (alreadyReported[i]) continue; // avoid reporting same value twice

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    alreadyReported[i] = true;
                    alreadyReported[j] = true;
                    foundAny = true;
                }
            }
        }

        if (!foundAny) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] seatNumbers = new int[n];
        System.out.println("Enter " + n + " seat numbers (space-separated or one per line):");

        // Supports both space-separated on one line and one-per-line input
        String line = sc.nextLine().trim();
        String[] parts = line.split("\\s+");

        if (parts.length >= n) {
            for (int i = 0; i < n; i++) {
                seatNumbers[i] = Integer.parseInt(parts[i]);
            }
        } else {
            for (int i = 0; i < parts.length; i++) {
                seatNumbers[i] = Integer.parseInt(parts[i]);
            }
            for (int i = parts.length; i < n; i++) {
                seatNumbers[i] = Integer.parseInt(sc.nextLine().trim());
            }
        }

        checkDuplicateSeats(seatNumbers);

        sc.close();
    }
}
