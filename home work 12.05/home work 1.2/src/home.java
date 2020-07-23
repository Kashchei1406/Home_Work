import java.util.Scanner;

public class home {
    public static void main(String[] args) {

        int a = 50;
        int b = 100;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scan.nextInt();
        System.out.println();

        if (x <= a) {
            System.out.println("Первый промежуток");
        }
        if (x > a && x <= 100) {
            System.out.println("Второй промежуток");
        }
        if (x > b) {
            System.out.println("Третий проиежуток");
        }
    }
}
