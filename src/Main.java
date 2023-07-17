import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        scanner.close();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; Math.pow(4, i) <= sayi; i++) {
            System.out.println((int)Math.pow(4, i));
        }

        System.out.println("5'in kuvvetleri:");
        for (int i = 1; Math.pow(5, i) <= sayi; i++) {
            System.out.println((int)Math.pow(5, i));

    }
}
}