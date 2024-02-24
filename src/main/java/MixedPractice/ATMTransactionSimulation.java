package MixedPractice;

import java.util.Scanner;

public class ATMTransactionSimulation {
    private static Scanner scanner = new Scanner(System.in);
    private static String currentCardNumber = "1234 5678 9012 3456"; // Örnek kart numarası
    private static String currentPIN = "1234"; // Örnek şifre
    private static double balance = 1000.00; // Örnek başlangıç bakiyesi

    public static void main(String[] args) {
        System.out.println("ATM'ye Hoş Geldiniz!");

        // Kullanıcı girişini sağlayan döngü
        while (!login()) {
            System.out.println("Giriş başarısız. Lütfen tekrar deneyin.");
        }

        // Kullanıcı giriş yaptıktan sonra işlem seçeneklerini gösteren fonksiyon
        showMenu();
    }

    // Kullanıcı girişini doğrulayan fonksiyon
    private static boolean login() {
        System.out.print("Kart Numaranızı Girin: ");
        String cardNumberInput = scanner.nextLine();

        System.out.print("Şifrenizi Girin: ");
        String pinInput = scanner.nextLine();

        // Kart numarası ve şifre doğrulaması
        if (cardNumberInput.equals(currentCardNumber) && pinInput.equals(currentPIN)) {
            System.out.println("Giriş Başarılı!");
            return true;
        } else {
            return false;
        }
    }

    // Kullanıcıya işlem seçeneklerini gösteren fonksiyon
    private static void showMenu() {
        int choice = 0;
        while (choice != 6) {
            System.out.println("\nLütfen yapmak istediğiniz işlemi seçin:");
            System.out.println("1. Bakiye Sorgula");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Çekme");
            System.out.println("4. Para Gönderme");
            System.out.println("5. Şifre Değiştirme");
            System.out.println("6. Çıkış");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    sendMoney();
                    break;
                case 5:
                    changePIN();
                    break;
                case 6:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0); // Programı sonlandır
                    break;
                default:
                    System.out.println("Geçersiz seçenek!");
                    break;
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Bakiyeniz: " + balance);
        showMenu();
    }

    private static void deposit() {
        System.out.print("Yatırmak istediğiniz miktarı girin: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Yeni bakiyeniz: " + balance);
        showMenu();
    }

    private static void withdraw() {
        System.out.print("Çekmek istediğiniz miktarı girin: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Yetersiz bakiye!");
        } else {
            balance -= amount;
            System.out.println("Yeni bakiyeniz: " + balance);
        }
        showMenu();
    }

    private static void sendMoney() {
        System.out.print("Göndermek istediğiniz IBAN'ı girin: ");
        String iban = scanner.next();
        if (!iban.startsWith("TR") || iban.length() != 26) {
            System.out.println("Geçersiz IBAN!");
        } else {
            System.out.print("Göndermek istediğiniz miktarı girin: ");
            double amount = scanner.nextDouble();
            if (amount > balance) {
                System.out.println("Yetersiz bakiye!");
            } else {
                balance -= amount;
                System.out.println("Gönderim başarılı. Yeni bakiyeniz: " + balance);
            }
        }
        showMenu();
    }

    private static void changePIN() {
        System.out.print("Mevcut şifrenizi girin: ");
        String currentPinInput = scanner.next();
        if (!currentPinInput.equals(currentPIN)) {
            System.out.println("Hatalı şifre!");
        } else {
            System.out.print("Yeni şifrenizi girin: ");
            String newPin = scanner.next();
            System.out.print("Yeni şifrenizi tekrar girin: ");
            String newPinConfirmation = scanner.next();
            if (!newPin.equals(newPinConfirmation)) {
                System.out.println("Şifreler eşleşmiyor!");
            } else {
                currentPIN = newPin;
                System.out.println("Şifre değiştirme başarılı!");
            }
        }
        showMenu();
    }
}