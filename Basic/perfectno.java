public class perfectno{
    public static void main(String[] args){
        int n=10;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum==n?"PErfect":"Not Perfect");

    }
}