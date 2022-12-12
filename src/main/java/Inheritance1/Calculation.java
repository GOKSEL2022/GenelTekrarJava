package Inheritance1;

public class Calculation {

    int z;

    public static int  a=30;
    public static  int b=20;

    protected void toplama(int x,int y){
        z=x+y;
        System.out.println("Verilen sayilarin toplami :"+z);
    }

    public void cikarma(int x,int y){
        z=x-y;
        System.out.println("Verilen sayilarin farki :"+z);
    }

    public static int buyukSayi=100;


}