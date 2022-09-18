
public class array {
    public static void main(String[] args) {
        int n;

        n = 5;

        int[] aray = new int[n];

        for (int i = 0; i < n; i++) {

            aray[i] = i * i;
            System.out.println("element o indeksie " + i + " to " + aray[i]);

        }
    }
}

