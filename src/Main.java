
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.


        //Değişkenler Oluşturulur.
        double  acilisUcreti, mesafe,toplamUcret;

        acilisUcreti=10.0;

        //Scanner sınıfı tanımlanır
        Scanner girdi= new Scanner(System.in);

        //Kullanıcıdan Veriler alınır
        System.out.println("Kaç KM Gidilecek: ");
        mesafe=girdi.nextDouble();

        //Tutar Hesaplanır ve Yazdırılırı
        toplamUcret=mesafe*2.20+acilisUcreti;

        double hesap=(toplamUcret<20) ? 20:toplamUcret;
        System.out.println("Ödeyeceğiniz Tutar: "+hesap);









    }
}
