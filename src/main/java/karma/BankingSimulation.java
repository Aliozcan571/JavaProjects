package karma;

import java.util.Scanner;

public class BankingSimulation {
    public static void main(String[] args) throws InterruptedException {

        String userName;
        String password;

        Scanner inp = new Scanner(System.in);
        int right = 3;
        int select;
        int bakiye =0;

        do {
            System.out.print("Kullanıcı Adınız: ");
            userName = inp.nextLine();
            System.out.print("Parolanız: ");
            password = inp.nextLine();

            if (userName.equals("ali") && password.equals("ali123")){
                System.out.println("Merhaba Hoş geldiniz");

                do {
                    System.out.println("**Lütfen yapmak istediğiniz işlemi seçin..**");
                    System.out.println(
                                    "1- Para Yatırma\n"+
                                    "2- Para Çekme\n"+
                                    "3- Bakiye sorgulama\n"+
                                    "4- Çıkış Yap");

                    select = inp.nextInt();
                    if (select==1){
                        System.out.println("Para yatırma miktarı: ");
                        int fiyat = inp.nextInt();
                        bakiye += fiyat;
                    } else if (select==2) {
                        System.out.println("Para çekme miktarı: ");
                        int fiyat = inp.nextInt();
                        if (bakiye<fiyat){
                            System.out.println("Bakiye yetersiz");
                        }
                        bakiye -=fiyat;
                    } else if (select==3) {
                        System.out.println("Bakiyeniz: "+ bakiye);
                    }else if (select==4){
                        System.out.println("İyi günler dileriz");
                    }else {
                        System.out.println("Hatalı numara girdiniz. Lütfen tekrar deneyin..");
                    }
                    Thread.sleep(1000);
                }while (select!=4);
                break;

            }else {

                right--;

                if (right==0){
                    System.err.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");

                }else {
                    System.err.println("Kullanıcı adınız veya şifreniz yanlış. Lütfen tekrar deneyin..");
                    System.out.println("Kalan hakkınız: "+ right +"\n");
                }
            }

        }while (right>0);

    }

}
