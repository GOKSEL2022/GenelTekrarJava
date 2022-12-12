package Exception1;

public class Ex01 {

    public static void main(String[] args) {

        //try

        int x=12;
        int y=0;

        //System.out.println(x/y);
/*
        if (y>=0) {
            System.out.println("Sifira bölemezsiniz");
        }else{
            System.out.println(x/y);
        }

 */

        try {
            System.out.println(x/y);
        }catch (ArithmeticException e){
            System.out.println("Sifira bölemezsiniz." + e.getMessage());   // teknik mesaj
            e.printStackTrace();       // hatanın kaynağı
        }






    }

}
