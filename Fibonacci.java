package BirinciHafta;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int ilkSayi =0,ikinciSayi=1,sayi;

        System.out.print("İstediğiniz Uzunlukta Seri Çıktısı İçin Sayınızı Giriniz:");
        sayi = input.nextInt();


        for (int i =1; i<sayi;i++){
            System.out.print(ilkSayi+",");
            int sonrakiSayi = ilkSayi+ikinciSayi;
            ilkSayi=ikinciSayi;
            ikinciSayi=sonrakiSayi;
        }
    }
}

