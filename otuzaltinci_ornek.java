package JAVA101;
import java.util.Scanner;
public class otuzaltinci_ornek {
    public static void cikti(int sayi,int n){
        System.out.print(sayi+" ");
        if (sayi>0){
            cikti(sayi-5,n);
        }
        if (sayi<n){
            System.out.print((sayi+5+" "));
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int n = inp.nextInt();
        System.out.print("çıktısı: ");
        cikti(n,n);
    }
}
  