package MixedPractice;

import java.util.Scanner;

public class MinMaxFinder {

    public static void main(String[] args) {
        //Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
        //ve bu sayıları ekrana yazan programı yazın.

//        Senaryo
//
//        Kaç tane sayı gireceksiniz: 4
//        1. Sayıyı giriniz: 16
//        2. Sayıyı giriniz: -22
//        3. Sayıyı giriniz: -15
//        4. Sayıyı giriniz: 100
//        En büyük sayı: 100
//        En küçük sayı: -22

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        System.out.print("1. Sayıyı giriniz: ");
        int ilkSayi = scanner.nextInt();

        int min = ilkSayi;
        int max =ilkSayi;

        int sayi ;
        for (int i = 1; i <n ; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            sayi=scanner.nextInt();

            if (sayi>max){
                 max=sayi;
            }
            if (sayi<min){
                 min=sayi;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
