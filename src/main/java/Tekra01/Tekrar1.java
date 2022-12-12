package Tekra01;

import java.util.*;

public class Tekrar1 {
    public static void main(String[] args) {

        HashMap<String,Integer> sanatcilar=new HashMap<>();
        sanatcilar.put("Tarik Akan",75);
        sanatcilar.put("Erol TAŞ",80);
        sanatcilar.put("İlyas SALMAN",78);
        System.out.println(sanatcilar);

        Set<String > keys=sanatcilar.keySet();
        System.out.println(keys);

        Collection<Integer> value=sanatcilar.values();
        System.out.println(value);

        Integer ilkYas=sanatcilar.get("İlyas SALMAN");
        System.out.println(ilkYas);

        sanatcilar.entrySet();
        System.out.println(sanatcilar);

        PriorityQueue<String >myQueu=new PriorityQueue<>();
        myQueu.add("Ali");
        myQueu.add("Ayşe");
        myQueu.add("İsa");
        myQueu.add("Ata");
        System.out.println(myQueu);

        String s =myQueu.peek();
        System.out.println(s);

        System.out.println(myQueu);

        String a =myQueu.poll();
        System.out.println(a);

        System.out.println(myQueu);




    }
}
