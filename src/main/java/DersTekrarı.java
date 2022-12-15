public class DersTekrarı {
    public static void main(String[] args) {

        String s="";

        for (int i=20;i>2;i--){
            s=s+i +" ";

        }
        System.out.println(s);


        int satir=5;
        int sütun=3;
        for (int i=1;i<=satir;i++){
            String a="";
            for (int k=1;k<=i;k++){
                a=a+"A"+" ";
            }
            System.out.println(a);
        }

        int num=3;
        for (int i=1;i<11;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
        int str=3;
        int stn=5;
        for (int i=1;i<=str;i++){
            String x="";
            for (int k=1;k<=5;k++){
                x=x+"A"+" ";
        }
            System.out.println(x);


        }

    }

}
