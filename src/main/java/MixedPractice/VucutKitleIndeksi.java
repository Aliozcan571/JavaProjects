package MixedPractice;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {

        /*
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        */

//        Senaryo:
//        Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
//        Lütfen kilonuzu giriniz : 105
//        Vücut Kitle İndeksiniz : 35.49215792320173


        Scanner scanner = new Scanner(System.in);
        double boy, kilo ;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu (kg) giriniz: ");
        kilo = scanner.nextDouble();


        double vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);
    }

}
