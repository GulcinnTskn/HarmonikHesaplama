import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        double harmonikSerisi = 0;

        for (double i = 1; i <= sayi; i++) {
            harmonikSerisi += 1/i;
        }

        System.out.println("Harmonik serisi: " + harmonikSerisi);
    }
}
