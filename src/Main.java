import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int dersSayisi = 0;

        System.out.print("Matematik notunu girin: ");
        int mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            dersSayisi++;
        }

        System.out.print("Fizik notunu girin: ");
        int fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }

        System.out.print("Türkçe notunu girin: ");
        int turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya notunu girin: ");
        int kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }

        System.out.print("Müzik notunu girin: ");
        int muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }

        if (dersSayisi > 0) {
            double ortalama = (double) toplam / dersSayisi;
            System.out.println("Ortalamanız: " + ortalama);

            if (ortalama >= 55) {
                System.out.println("Tebrikler, geçtiniz!");
            } else {
                System.out.println("Üzgünüm, kaldınız.");
            }
        } else {
            System.out.println("Hiç geçerli not girilmedi, ortalama hesaplanamadı.");
        }

        input.close();
    }
}
