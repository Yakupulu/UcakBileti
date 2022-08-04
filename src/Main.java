import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, tripType;
        double price, discount;
        boolean isError = false;


        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi Km cinsinden giriniz:");
        distance = inp.nextInt();
        System.out.print("Yasinizi giriniz:");
        age = inp.nextInt();
        System.out.print("Yolculu Tipi:\n1=>Tek yon\n2=>Gidis-Donus\nSeciniz:");
        tripType = inp.nextInt();

        price = distance * 0.10;

        if (age < 12) {
            price -= price * 0.5;
            if (tripType == 2) {
                price -= price * 0.2;
                price=price*2;
            } else if (tripType == 1) {
                price = price * 1;
            } else {
                isError = true;
            }

        } else if (age >= 12 && age <= 24) {
            price -= price * 0.1;
            if (tripType == 2) {
                price -= price * 0.2;
                price=price*2;
            } else if (tripType == 1) {
                price = price * 1;
            } else {
                isError = true;
            }

        } else if (age >= 65) {
            price -= price * 0.3;
            if (tripType == 2) {
                price -= price * 0.2;
                price=price*2;
            } else if (tripType == 1) {
                price = price * 1;
            } else {
                isError = true;
            }

        } else {
            if (tripType == 2) {
                price -= price * 0.2;
                price=price*2;
            } else if (tripType == 1) {
                price = price * 1;
            } else {
                isError = true;
            }

        }


        if (isError) {
            System.out.println("Hatali giris yaptiniz.Tekrar Deneyiniz");
        } else {
            System.out.println("Odemeniz gereken tutar:" + price+" Tl");
        }

    }
}
