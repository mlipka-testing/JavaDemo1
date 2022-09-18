import java.util.Scanner;
import java.text.DecimalFormat;

public class TaxCalc {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dochod");
        int income = scanner.nextInt();
        double tax;

        // do 120k -> 17%
        // pow 120k -> 32%
        // pow 1000000 -> 36%

        if (income < 120000) {
            tax = income * 0.17;
        } else if (income < 1000000) {
            tax = 120000 * 0.17 + (income - 120000) * 0.32;
        } else {
            tax = 120000 * 0.17 + 880000 * 0.32 + (income - 1000000) * 0.36;
        }

        System.out.println("Podatek do zaplacenia " + df.format(tax));
    }
}
