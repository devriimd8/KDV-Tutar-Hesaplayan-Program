import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        /* (Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/
        Scanner input = new Scanner(System.in);
        double fiyat, kdvOran, kdvFiyat, kdvliFiyat;
        System.out.println("ücret tutarını giriniz :");
        fiyat = input.nextInt();
        kdvOran = (fiyat>0) && (fiyat<1000) ? 0.18 : 0.8;
        kdvFiyat = fiyat * kdvOran;
        kdvliFiyat = fiyat + kdvFiyat;

        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV Fiyatı: " + kdvFiyat);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
    }
}
https://app.patika.dev/
