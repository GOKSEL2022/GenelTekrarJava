package Exception1;

public class Ex02 {
    public static void main(String[] args) {

        String arr[]={"Ali","Can","Veli","Han"};
        getElement(arr,1);
        getElement(arr,4);
    }
    public static void getElement(String arr[],int idx){
        try {
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("aranan index yok");
            e.printStackTrace();
        }

        System.out.println("merhaba");

    }
}