import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);

        System.out.println("Podaj liczbę a");
        int a = skan.nextInt();

        System.out.println("Podaj liczbę b");
        int b = skan.nextInt();

        if( a > b){
            System.out.println("a jest większe niż b");
        }
        else if (a == b){
            System.out.println("a jest równe b");
        }
        else
            System.out.println("b jest większe od a");
    }
}
