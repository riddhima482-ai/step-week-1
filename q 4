import java.util.Scanner;

public class WarehouseInventoryBalancer {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;

        for (int value : sectionA) totalA += value;
        for (int value : sectionB) totalB += value;

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        // Track the highest quantity value across both sections, along with
        // which section and (1-based) item index it was found at.
        int highestValue = sectionA[0];
        String highestSection = "Section A";
        int highestIndex = 1;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highestValue) {
                highestValue = sectionA[i];
                highestSection = "Section A";
                highestIndex = i + 1;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highestValue) {
                highestValue = sectionB[i];
                highestSection = "Section B";
                highestIndex = i + 1;
            }
        }

        System.out.println("Section A Total: " + totalA +
                " | Section B Total: " + totalB +
                " | Status: " + status +
                " | Highest Quantity: " + highestValue +
                " (" + highestSection + ", Item " + highestIndex + ")");
    }

    static int[] readArray(Scanner sc, String label, int n) {
        int[] arr = new int[n];
        System.out.println("Enter " + n + " quantities for " + label + " (space-separated or one per line):");
        String line = sc.nextLine().trim();
        String[] parts = line.split("\\s+");

        if (parts.length >= n) {
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
        } else {
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            for (int i = parts.length; i < n; i++) {
                arr[i] = Integer.parseInt(sc.nextLine().trim());
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items per section: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] sectionA = readArray(sc, "Section A", n);
        int[] sectionB = readArray(sc, "Section B", n);

        analyzeInventory(sectionA, sectionB);

        sc.close();
    }
}
