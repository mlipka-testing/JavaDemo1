import java.util.Scanner;

public class bomba {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Za ile wybuchnie bomba? ");

            for (int i = scanner.nextInt(); i > 0 ; i--) {
                System.out.println("Bomba wybuchnie za " + i);
            }
            System.out.println("Ka-boom");
        }


}
