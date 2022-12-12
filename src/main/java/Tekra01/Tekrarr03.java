package Tekra01;

import java.util.HashSet;
import java.util.TreeSet;

public class Tekrarr03 {

    public static void main(String[] args) {

        TreeSet<String > ePosta=new TreeSet<>();
        ePosta.add("g@gmail.com");
        ePosta.add("a@gmail.com");
        ePosta.add("b@gmail.com");
        System.out.println(ePosta);

        ePosta.add("A");
        ePosta.add("Z");
        ePosta.add("Y");
        ePosta.add("H");
        System.out.println(ePosta);

        HashSet<String >isimler=new HashSet<>();
        isimler.add("j");
        isimler.add("z");
        isimler.add("T");
        isimler.add("G");

        TreeSet<String>adlar=new TreeSet<>(isimler);
        System.out.println(adlar);
    }
}
