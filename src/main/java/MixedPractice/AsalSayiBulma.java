package karma;
import java.util.Scanner;
public class AsalSayiBulma {

    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Sayı Giriniz: ");
            int girilenSayi = scanner.nextInt();
            if (girilenSayi==0){
                break;
            }
            if (asalMi(girilenSayi)) {
                System.out.println(girilenSayi + " sayısı ASALDIR");
            } else {
                System.out.println(girilenSayi + " sayısı ASAL değildir !");
            }
            System.out.println("Çıkış için sıfır (0) giriniz");
            System.out.println("------------");
        }
    }

    // Asal sayıyı kontrol eden metot
    static boolean asalMi(int sayi) {

        if (sayi==2 || sayi==3 || sayi==5){
            return true;
        } else return sayi % 2 != 0 && sayi % 3 != 0 && sayi%5!=0 && sayi!=1;
    }
}
