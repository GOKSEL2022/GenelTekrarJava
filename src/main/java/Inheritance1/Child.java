package Inheritance1;

public class Child extends Parent {

    Child(){

        System.out.println("Child class parmetersiz cons ");

    }


    Child(int x){
        super(x);
        System.out.println(super.x);
        System.out.println("Child class parmetersiz cons ");

    }

    Child(int sayi1 ,int sayi2){
        super(sayi1,sayi2);
        System.out.println("Child class 2 parmeterli cons ");
    }


    public static void main(String[] args) {

        Child child=new Child(3,6);
        Child child2=new Child(3);

    }


}