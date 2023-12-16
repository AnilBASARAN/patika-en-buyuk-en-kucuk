import java.util.Scanner;
public class EnBuyukEnKucuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Kaç sayı gireceksiniz?  ");
        int count = input.nextInt() ;

        // kucuk sayısını pozitif sonsuz sayısına eşliyoruz ki for dongusunde karşısına çıkan ilk sayı
        // ona kıyasla kucuk kalsın ve if sorgusunda en kücüklük bizim ilk başta atadığımız kucuk değerine geçsin.
        // aynı mantık büyük için de geçerli

        double kucuk = Double.POSITIVE_INFINITY;
        double buyuk = Double.NEGATIVE_INFINITY;
        do {
            System.out.print(count +". sayıyı giriniz:  ");
            n = input.nextInt();
            if(n<kucuk) kucuk = n;
            if(n>buyuk) buyuk = n;
            count --;

        }while (count>0);
        System.out.println("Girdiğiniz sayılar içinde:\n En küçüğü:  "+kucuk+", \n"+
        " En büyüğü : "+buyuk);
    }
}
