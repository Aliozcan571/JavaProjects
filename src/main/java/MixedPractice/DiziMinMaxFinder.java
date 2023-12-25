package MixedPractice;

public class DiziMinMaxFinder {

    public static void main(String[] args) {

        int[] liste = {5, 4, 7, 65, 1218, 51};

        // İlk elemanla min ve max'ı başlat
        int min = liste[0];
        int max = liste[0];

        for (int eleman : liste) {
            if (eleman < min) {
                min = eleman;
            }
            if (eleman > max) {
                max = eleman;
            }
        }
        System.out.println("En küçük değer: " + min);
        System.out.println("En büyük değer: " + max);
    }
}

