package encapsulation1;

public class CreditCardRunner {


    public static void main(String[] args) {

        CreditCard cd=new CreditCard();
        System.out.println(cd.getAge());//21
        System.out.println(cd.getCcn());
        System.out.println(cd.isExpired());

        System.out.println("=======================");

        cd.setCcn("******************1212");//******************1212

        String ccn=cd.getCcn();
        cd.setCcn("************"+ccn.substring(ccn.length()-4));

        //************1212
        System.out.println(cd.getCcn());

        CreditCard cd3=new CreditCard();
        System.out.println(cd3.getCcn());
        cd.setAge(60);
        cd.setExpired(true);

        System.out.println(cd.getAge());
        System.out.println(cd.isExpired());

    }
}