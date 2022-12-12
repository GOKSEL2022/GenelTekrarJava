package encapsulation1;

public class AccountRunner {

    public static void main(String[] args) {

        Account acc=new Account();
        acc.setAcc_no(731216123412l);
        acc.setName("Frotan");
        acc.setEmail("frotan1954@gmail.com");
        acc.setAmount(12000f);

        System.out.println(acc.getAcc_no()+ " "+acc.getName()+" "
                +acc.getEmail()+ " "+acc.getAmount());

    }

}