public class armstrongnum{
    static int power(int base,int exp){
        int pow=1;
        for(int i=1;i<=exp;i++){
            pow=pow*base;
        }
        return pow;

    }
    public static void main(String[] args){
        int num=1634;
        int n=num;
        int n1=num;
        int sum=0;
        int rem=0;
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        while(num!=0){
            rem=num%10;
            sum=sum+power(rem,count);
            num=num/10;
            
        }
        System.out.println(sum==n1?"Armstrong":"Not a Armstrong");
        
    }
}