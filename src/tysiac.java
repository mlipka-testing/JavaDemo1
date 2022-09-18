public class tysiac {

    public static void main(String[] args) {
        int sum = 0;
        //suma liczb podzielnych przez 3 z zakresu 1-1000

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
