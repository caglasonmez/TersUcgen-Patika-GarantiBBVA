package CaglaSonmez;

import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz: ");
        int numberDigits = input.nextInt();

        for (int i = numberDigits; i >= 1; i--) {
            for (int j = 1; j <= (numberDigits - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
