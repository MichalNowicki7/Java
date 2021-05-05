import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        int y;
        char znak;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        x = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        y = scanner.nextInt();

        znak = scanner.next().charAt(0);
        switch (znak) {
            case '+': {
            System.out.println(x + y);
            break;
        } case '-': {
            System.out.println(x - y);
            break;
        } case '*': {
            System.out.println(x * y);
            break;
        } case '/': {
            if (y != 0) {
                System.out.println(x / y + " i " + x % y + " reszty");
            } else {
                System.out.println("Nie można dzielić przez zero");
            }
        } break;
        }

    }

}
