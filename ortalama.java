package Baslangic;
import java.util.Scanner;
public class ortalama {
    public static void main(String[] args) {
        int mat, fizik, tarih, kimya, turkce, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + tarih + kimya + turkce + muzik);
        double sonuc = toplam/6.0;
        System.out.println("Not Ortalamanız: "+ sonuc);
        String str = sonuc > 60 ? "Geçti" : "Kaldı";
        System.out.print(str);

    }
}
