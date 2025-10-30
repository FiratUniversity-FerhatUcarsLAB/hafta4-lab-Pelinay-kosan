import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class hafta4 {


    private static final double SGK_ORAN = 0.14;        // %14
    private static final double GELIR_VERGISI_ORAN = 0.15; // %15
    private static final double DAMGA_VERGISI_ORAN = 0.00759; // %0.759 (0.759 / 100)
    private static final double MESAI_KATSAYISI = 1.5;
    private static final int AYLIK_ORTALAMA_CALISMA_SAATI = 160;
    private static final int AYLIK_IS_GUNU = 22;

    public static void main(String[] args) {

        DecimalFormat paraFormat = new DecimalFormat("#,##0.00", new java.text.DecimalFormatSymbols(Locale.US));
        DecimalFormat yuzdeFormat = new DecimalFormat("0.0", new java.text.DecimalFormatSymbols(Locale.US));

        Scanner scanner = new Scanner(System.in);

        System.out.println("💰 Maaş Hesaplama Programı Başlatılıyor 💰");
        System.out.println(new String(new char[50]).replace('\0', '-'));

        System.out.print("Çalışanın Adı ve Soyadı: ");
        String adSoyad = scanner.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = scanner.nextDouble();

        System.out.print("Haftalık Çalışma Saati (saat): ");
        int haftalikCalismaSaati = scanner.nextInt();

        System.out.print("Mesai Saati Sayısı (saat): ");
        int mesaiSaati = scanner.nextInt();

        scanner.close();


        double saatlikBrutUcret = brutMaas / AYLIK_ORTALAMA_CALISMA_SAATI;
        double mesaiUcreti = saatlikBrutUcret * mesaiSaati * MESAI_KATSAYISI;
        double toplamGelir = brutMaas + mesaiUcreti;
        double sgkKesintisi = toplamGelir * SGK_ORAN;
        double gelirVergisiKesintisi = toplamGelir * GELIR_VERGISI_ORAN;
        double damgaVergisiKesintisi = toplamGelir * DAMGA_VERGISI_ORAN;
        double toplamKesinti = sgkKesintisi + gelirVergisiKesintisi + damgaVergisiKesintisi;
        double netMaas = toplamGelir - toplamKesinti;
        double kesintiOraniYuzde = (toplamKesinti / toplamGelir) * 100;
        double toplamCalismaSaati = AYLIK_ORTALAMA_CALISMA_SAATI + mesaiSaati;
        double saatlikNetKazanc = netMaas / toplamCalismaSaati;
        double gunlukNetKazanc = netMaas / AYLIK_IS_GUNU;


        System.out.println("\n\n" + new String(new char[70]).replace('\0', '='));
        System.out.printf("%45s\n", "PROFESYONEL BORDRO");
        System.out.println(new String(new char[70]).replace('\0', '='));

        System.out.printf("Çalışan Adı ve Soyadı: %s\n", adSoyad);
        System.out.println(new String(new char[70]).replace('\0', '-'));

        System.out.printf("%-30s %18s %-20s\n", "GELİR BİLGİLERİ", "TUTAR (TL)", "AÇIKLAMA");
        System.out.println(new String(new char[70]).replace('\0', '-'));
        System.out.printf("%-30s %18s %-20s\n", "Aylık Brüt Maaş", paraFormat.format(brutMaas), "Normal Çalışma");
        System.out.printf("%-30s %18s %-20s\n", "Mesai Ücreti", paraFormat.format(mesaiUcreti),
                "(" + mesaiSaati + " saat x " + MESAI_KATSAYISI + ")");
        System.out.println(new String(new char[70]).replace('\0', '-'));
        System.out.printf("%-30s %18s\n", "**TOPLAM GELİR**", paraFormat.format(toplamGelir));
        System.out.println(new String(new char[70]).replace('\0', '='));

        System.out.printf("%-30s %18s %-20s\n", "KESİNTİ BİLGİLERİ", "TUTAR (TL)", "ORAN");
        System.out.println(new String(new char[70]).replace('\0', '-'));
        System.out.printf("%-30s %18s %-20s\n", "SGK Kesintisi", paraFormat.format(sgkKesintisi),
                "(" + (SGK_ORAN * 100) + "%)");
        System.out.printf("%-30s %18s %-20s\n", "Gelir Vergisi", paraFormat.format(gelirVergisiKesintisi),
                "(" + (GELIR_VERGISI_ORAN * 100) + "%)");
        System.out.printf("%-30s %18s %-20s\n", "Damga Vergisi", paraFormat.format(damgaVergisiKesintisi),
                "(" + (DAMGA_VERGISI_ORAN * 100) + "%)");
        System.out.println(new String(new char[70]).replace('\0', '-'));
        System.out.printf("%-30s %18s\n", "**TOPLAM KESİNTİ**", paraFormat.format(toplamKesinti));
        System.out.println(new String(new char[70]).replace('\0', '='));
        
        System.out.printf("%-30s %18s\n", "NET MAAŞ (ELDE EDİLEN)", paraFormat.format(netMaas));
        System.out.println(new String(new char[70]).replace('\0', '='));

        System.out.println("\nİSTATİSTİKLER:");
        System.out.println(new String(new char[25]).replace('\0', '-'));
        System.out.printf("%-30s %18s\n", "Toplam Kesinti Oranı", "%" + yuzdeFormat.format(kesintiOraniYuzde));
        System.out.printf("%-30s %18s\n", "Saatlik Net Kazanç", paraFormat.format(saatlikNetKazanc) + " TL");
        System.out.printf("%-30s %18s\n", "Günlük Net Kazanç (22 Gün)", paraFormat.format(gunlukNetKazanc) + " TL");
        System.out.println(new String(new char[70]).replace('\0', '='));
    }
}


💰 Maaş Hesaplama Programı Başlatılıyor 💰
--------------------------------------------------
Çalışanın Adı ve Soyadı: PELİNAY KOŞAN
Aylık Brüt Maaş (TL): 85000
Haftalık Çalışma Saati (saat): 42
Mesai Saati Sayısı (saat): 7


======================================================================
                           PROFESYONEL BORDRO
======================================================================
Çalışan Adı ve Soyadı: PELİNAY KOŞAN
----------------------------------------------------------------------
GELİR BİLGİLERİ                        TUTAR (TL) AÇIKLAMA            
----------------------------------------------------------------------
Aylık Brüt Maaş                         85,000.00 Normal Çalışma      
Mesai Ücreti                             5,578.12 (7 saat x 1.5)      
----------------------------------------------------------------------
**TOPLAM GELİR**                        90,578.12
======================================================================
KESİNTİ BİLGİLERİ                      TUTAR (TL) ORAN                
----------------------------------------------------------------------
SGK Kesintisi                           12,680.94 (14.000000000000002%)
Gelir Vergisi                           13,586.72 (15.0%)             
Damga Vergisi                              687.49 (0.759%)            
----------------------------------------------------------------------
**TOPLAM KESİNTİ**                      26,955.14
======================================================================
NET MAAŞ (ELDE EDİLEN)                  63,622.98
======================================================================

İSTATİSTİKLER:
-------------------------
Toplam Kesinti Oranı                        %29.8
Saatlik Net Kazanç                      380.98 TL
Günlük Net Kazanç (22 Gün)            2,891.95 TL
======================================================================

Process finished with exit code 0

