package ex_02_Java_Basics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DigitPairSum {

    public static void main(String[] args) {
        long number = 7795711068L;

        // Extract digits from the number
        int[] digits = extractDigits(number);
        System.out.println("Number: " + number);
        System.out.print("Digits: [");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i < digits.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println();

        // Find all position-based pairs that sum to 9
        List<String> positionPairs = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] + digits[j] == 9) {
                    String pair = "Position (" + i + "," + j + ") -> " +
                            digits[i] + "+" + digits[j] + "=9";
                    positionPairs.add(pair);
                }
            }
        }

        // Find unique value pairs that sum to 9
        Set<String> uniqueValuePairs = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] + digits[j] == 9) {
                    int min = Math.min(digits[i], digits[j]);
                    int max = Math.max(digits[i], digits[j]);
                    uniqueValuePairs.add(min + "+" + max + "=9");
                }
            }
        }

        // Print results
        System.out.println("=== ALL POSITION-BASED COMBINATIONS ===");
        if (positionPairs.isEmpty()) {
            System.out.println("No pairs found that sum to 9");
        } else {
            for (int i = 0; i < positionPairs.size(); i++) {
                System.out.println((i + 1) + ". " + positionPairs.get(i));
            }
        }

        System.out.println("\n=== UNIQUE VALUE COMBINATIONS ===");
        if (uniqueValuePairs.isEmpty()) {
            System.out.println("No unique value pairs found");
        } else {
            int count = 1;
            for (String pair : uniqueValuePairs) {
                System.out.println(count + ". " + pair);
                count++;
            }
        }

        System.out.println("\n=== SUMMARY ===");
        System.out.println("Total position-based combinations: " + positionPairs.size());
        System.out.println("Total unique value combinations: " + uniqueValuePairs.size());

        // Show frequency of each digit
        System.out.println("\n=== DIGIT FREQUENCY ===");
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }
        for (int i = 0; i <= 9; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }
    }

    // Helper method to extract digits from a number
    private static int[] extractDigits(long number) {
        String numberStr = Long.toString(number);
        int[] digits = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }

        return digits;
    }
}

