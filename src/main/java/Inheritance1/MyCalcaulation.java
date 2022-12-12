package Inheritance1;

public class MyCalcaulation extends Calculation{

    public void carpma(int x,int y){
        z=x*y;
        System.out.println("Verilen saylarin carpmi :"+z);
        super.cikarma(a,b);
        super.toplama(a,b);
    }

    public void bolma(int x,int y){
        z=x/y;
        System.out.println("Verilen saylarin bolma :"+z);
        System.out.println(super.buyukSayi);
    }

    public static void main(String[] args) {

        Calculation cal=new Calculation();
        cal.toplama(10,5);
        cal.cikarma(20,10);
        MyCalcaulation cal2= new MyCalcaulation();
        cal2.toplama(a,b);//50
        cal2.cikarma(a,b);

        System.out.println("======");
        cal2.bolma(a,b);
        cal2.carpma(a,b);
        System.out.println(buyukSayi);

    }
}