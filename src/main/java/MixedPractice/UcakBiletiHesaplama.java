package MixedPractice;
import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {

//        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
//        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
//        Mesafe başına ücret 0,10 TL / km olarak alın.
//        İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
//        aşağıdaki indirimleri uygulayın ;
//
//        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
//        yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
//        şeklinde bir uyarı verilmelidir.
//        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise indirimli bilet fiyatı üzerinden %20 indirim uygulanır.

//        Senaryo:
//
//        Mesafeyi km türünden giriniz : 1500
//        Yaşınızı giriniz : 20
//        Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
//
//        Toplam Tutar = 216 TL

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        double mesafe = scanner.nextDouble();
        System.out.print("Yaşınızı giriniz : ");
        int yas = scanner.nextInt();
        System.out.print("Yolculuk tipini seçiniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        double normalTutar = mesafe * 0.10;
        double indirimOrani = 0;

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {

            if (yas < 12) {
                indirimOrani = 0.5;
            } else if (yas >= 12 && yas <= 24) {
                indirimOrani = 0.1;
            } else if (yas >= 65) {
                indirimOrani = 0.3;
            }
            double indirimliTutar = normalTutar - (normalTutar * indirimOrani);

            if (yolculukTipi == 2) {
                double gidisDonusIndirim = indirimliTutar * 0.20;
                indirimliTutar -= gidisDonusIndirim;
                indirimliTutar *= 2;
            }
            System.out.println("Toplam Tutar: " + indirimliTutar + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}