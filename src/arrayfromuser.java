import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class arrayfromuser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rozmiar tablicy ");
        int n = scanner.nextInt();
        int suma= 0;
        int max;
        int min;

        int[] aray = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Podaj numer ");
            aray[i] = scanner.nextInt();
        }
        min = aray[0];
        max = aray[0];

        for (int i = 0; i < n; i++) {
            suma += aray[i];
            if (aray[i] > max) {
                max = aray[i];
            }
            if (aray[i] < min) {
                min = aray[i];
            }

        }
        System.out.println(Arrays.toString(aray));

        //int min = Arrays.stream(aray).min().getAsInt();
        //int max = Arrays.stream(aray).max().getAsInt();
        //int sum = Arrays.stream(aray).sum();

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Mean = " + suma/aray.length);
    }

}
