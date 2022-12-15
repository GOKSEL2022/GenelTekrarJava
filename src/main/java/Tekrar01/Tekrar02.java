package Tekrar01;

import java.util.Deque;
import java.util.LinkedList;

public class Tekrar02 {

    public static void main(String[] args) {
        Deque<String> bankaSirasi=new LinkedList<>();
        bankaSirasi.add("Adem");
        bankaSirasi.add("İhsan");
        bankaSirasi.add("Sami");
        bankaSirasi.add("Zeki");
        System.out.println(bankaSirasi);

        String s=bankaSirasi.pop();
        System.out.println(s);
        System.out.println(bankaSirasi);
        String c=bankaSirasi.peekFirst();
        System.out.println(c);
        System.out.println(bankaSirasi);

        bankaSirasi.addLast("Zeki");
        System.out.println(bankaSirasi);
        bankaSirasi.removeFirst();
        System.out.println(bankaSirasi);
    }
}
