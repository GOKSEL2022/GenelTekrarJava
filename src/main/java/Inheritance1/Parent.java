package Inheritance1;

public class Parent {

    public int x=12;
    protected Parent(){
        System.out.println("Parent parametresiz cons. calisti");
    }

    public Parent (int sayi1, int sayi2){
        System.out.println("Parent 2 parameterli cons. calisti");
    }

    public Parent(int sayi3){
        System.out.println("Parent 1 parametrli cons. calisti");
    }

}