public class baseandexponent{
    static int power(int base,int exp){
        int pow=1;
        for(int i=1;i<exp;i++){
            pow=pow*base;
        }
        return pow;

    }
    public static void main(String[] args){
        int p=power(10,2);
        System.out.println(p);

        
    }
}