import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil,kati;
        Scanner input = new Scanner(System.in);

        System.out.println("Yıl Giriniz: ");
        yil = input.nextInt();

        kati = yil % 4;
        switch (kati) {
            case 0:
                System.out.println(yil + " bir artık yıldır!");
                break;
            default:
                System.out.println(yil + " bir artık yıl değildir!");
        }
    }

}

