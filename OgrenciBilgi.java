/*
 * Ad Soyad: [PELİNAY KOŞAN]
 * Ogrenci No: [250542002]
 * Tarih: [30.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Öğrencinin adını giriniz: ");
        String ad = input.nextLine();

        System.out.println("Öğrencinin soyadını giriniz: ");
        String soyad = input.nextLine();

        System.out.println("Öğrencinin numarasını giriniz: ");
        int numara = input.nextInt();

        System.out.print("Öğrencinin yaşını giriniz: ");
        int yas = input.nextInt();

        System.out.println("Genel Not Ortalamasını giriniz: " );
        double gno = input.nextDouble();

        System.out.println("\n----- ÖĞRENCİ BİLGİLERİ -----");
        System.out.printf("%-20s: %s %s\n", "Ad Soyad", ad, soyad);
        System.out.printf("%-20s: %d\n", "Numara", numara);
        System.out.printf("%-20s: %d\n", "Yaş", yas);
        System.out.printf("%-20s: %.2f\n", "Genel Not Ortalaması", gno);

     }

}
        
        
        
       ----- ÖĞRENCİ BİLGİLERİ -----
Ad Soyad            : PELİNAY KOŞAN
Numara              : 250542002
Yaş                 : 18
Genel Not Ortalaması: 3,18

Process finished with exit code 0
        
        
        

        
        
        
