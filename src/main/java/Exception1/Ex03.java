package Exception1;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
       Kullanicidan yasini isteyin
       kullanici yas olarak negatif bir sayi,
       0 veya
       120'den buyuk bir sayi girerse illegalArgumentException olusacak sekilde
       bir program yaziniz
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas<=0 || yas>120) {
            System.out.println("Lütfen geçerli bir yaş giriniz.");
            throw new IllegalArgumentException("Lütfen geçerli bir yaş giriniz.");
        }else {
            System.out.println("Uygun yas girdiğiniz için teşekkürler.");

        }
    }
}
