PELİNAY KOŞAN
250542002
    
    import java.util.Scanner;
import java.text.DecimalFormat;

public class hafta4 {


    private static final double PI = 3.14159;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("⭐ Daire ve Küre Hesaplayıcı Programına Hoş Geldiniz ⭐");
        System.out.println("-------------------------------------------------------");

        System.out.print("Lütfen dairenin yarıçapını (r) giriniz: ");
        double yaricap = scanner.nextDouble();

        double cap = 2 * yaricap;

        double daireAlani = PI * yaricap * yaricap;

        double daireCevresi = 2 * PI * yaricap;

        double kureHacmi = (4.0 / 3.0) * PI * yaricap * yaricap * yaricap;

        double kureYuzeyAlani = 4 * PI * yaricap * yaricap;

        System.out.println("\n✅ Hesaplama Sonuçları (Yarıçap = " + df.format(yaricap) + ") ✅");
        System.out.println("-------------------------------------------------------");

        System.out.println("   Daire Hesaplamaları:");
        System.out.println("   Dairenin Çapı (2 * r):           " + df.format(cap));
        System.out.println("   Dairenin Çevresi (2 * π * r):    " + df.format(daireCevresi));
        System.out.println("   Dairenin Alanı (π * r²):         " + df.format(daireAlani));
        System.out.println("-------------------------------------------------------");

        System.out.println("   Küre Hesaplamaları:");
        System.out.println("   Kürenin Hacmi ((4/3) * π * r³):  " + df.format(kureHacmi));
        System.out.println("   Kürenin Yüzey Alanı (4 * π * r²):" + df.format(kureYuzeyAlani));
        System.out.println("-------------------------------------------------------");

        scanner.close();
    }
}


⭐ Daire ve Küre Hesaplayıcı Programına Hoş Geldiniz ⭐
-------------------------------------------------------
Lütfen dairenin yarıçapını (r) giriniz: 10

✅ Hesaplama Sonuçları (Yarıçap = 10,00) ✅
-------------------------------------------------------
   Daire Hesaplamaları:
   Dairenin Çapı (2 * r):           20,00
   Dairenin Çevresi (2 * π * r):    62,83
   Dairenin Alanı (π * r²):         314,16
-------------------------------------------------------
   Küre Hesaplamaları:
   Kürenin Hacmi ((4/3) * π * r³):  4188,79
   Kürenin Yüzey Alanı (4 * π * r²):1256,64
-------------------------------------------------------

Process finished with exit code 0

