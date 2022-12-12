package Exception1;

public class Ex04 {
    public static void main(String[] args) {

        String s = "Hello!";
        getElementFromCharacter(s,1);
//        getElementFromCharacter(s,10);

        divided(s,1,2,1);
    }


    public static void getElementFromCharacter(String str,int idx){
        try {
            System.out.println(str.charAt(idx));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("girilen index String ta bulanmadi"+e.getMessage());
        }

    }
    public static void divided(String str, int idx1,int idx2,int idx3){

        try {
            int firstlength = str.substring(idx1,idx2).length();
            int secondtlength = str.substring(idx1,idx3).length();
            System.out.println(firstlength/secondtlength);
        }catch (ArithmeticException e){
            System.out.println("bolma da hata var  "+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("girilen index String ta bulanmadi");
            e.printStackTrace();
        }finally {
            System.out.println("code calsiti");
        }

    }

}