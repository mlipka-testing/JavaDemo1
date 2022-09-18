import java.util.Scanner;

public class SwitchNames {
        public static void main(String[] args) {
            System.out.println("podaj imię: ");

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            switch (name) {
                case "Cthulhu":
                    System.out.println("Cześć, "+ name);
                    break;
                case "Nyarlathotep":
                    System.out.println("Cześć, "+ name);
                    break;
                case "Yog'sothoth":
                    System.out.println("Cześć, "+ name);
                    break;
                case "Hastur":
                    System.out.println("Cześć, "+ name+ ". Wiesz, że tego imienia nie wolno wymawiać?");
                    break;
                default: System.out.println("Przykro mi, ale cię nie znam");
            }

            System.out.println("Koniec programu");
        }
    }

