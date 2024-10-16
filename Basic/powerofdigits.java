public class powerofdigits{
    static int power(int base,int exp){
        int pow=1;
        for(int i=1;i<=exp;i++){
            pow=pow*base;
        }
        return pow;

    }
    public static void main(String[] args){
        int num=12345;
        int sum=0;
        int rem=0;
        while(num!=0){
            rem=num%10;
            sum=sum+power(rem,2);
            num=num/10;
            System.out.println(sum);
        }
        System.out.println(sum);
        
    }
}