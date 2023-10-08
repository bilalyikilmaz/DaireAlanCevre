import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        //Değişkenler
        double aci, pi = 3.14, r, alan;

        // Kullanıcıdan Veri Girişi
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        r = inp.nextDouble();

        System.out.print("Daire diliminin açısını giriniz : ");
        aci = inp.nextDouble();


        // Hesaplamalar
        alan = (pi * (r * r) * aci) / 360;

        System.out.println("Daire Diliminin Alanı : " + alan);

    }
}
