package MixedPractice;

import java.util.Scanner;

public class ClosestNumber {

    public static void main(String[] args) {
//    Alıştırma;
//    Dizideki elemanların girilen sayıdan küçük en yakın sayıyı
//    ve en büyük en yakın sayıyı bulan programı yazınız.
//
//    Dizi : {15,12,788,1,-1,-778,2,0}
//    Girilen Sayı : 5
//    Girilen sayıdan küçük en yakın sayı : 2
//    Girilen sayıdan büyük en yakın sayı : 12

        int[] list = {15,12,788,1,-1,-778,2,-5,0};
        Scanner scanner = new Scanner(System.in);
        int girilenSayi =scanner.nextInt();
        int min =1;
        int max =-1;

        for (int w:list) {
            if (w<girilenSayi){
                if (min<w){
                    min=w;
                }
            }
            if (w>girilenSayi){
                if (max>w){
                    max=w;
                }
            }
        }
        System.out.println(min);
        System.out.println(max);

    }






}
