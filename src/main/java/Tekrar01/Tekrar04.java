package Tekrar01;

import java.util.LinkedList;

public class Tekrar04 {
    public static void main(String[] args) {


        LinkedList<String > name=new LinkedList<>();
        name.add("Ali");
        name.add("Ahmet");
        name.add("Ayşe");
        name.add("Göksel");

        adlariYazdir(name);
        System.out.println("*********");
        adlariBirleştir(name);
        System.out.println("*********");

    }
    public static void adlariYazdir(LinkedList<String > name){
        name.stream().filter(t->t.startsWith("G")).forEach(t-> System.out.println(t+" "));

    }
    public static void adlariBirleştir( LinkedList<String > name){
        name.stream().map(t->t+t+t+t).forEach(Tekrar04::yazdir);

    }

    public static void yazdir( String s){

        System.out.print("s");
        }
    }

