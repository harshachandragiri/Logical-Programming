public class fibinoccinth{
    public static void main(String[] args){
        int position=10;
        int n1=0;
        int n2=1;
        int sum=0;
        int i=1;
        while(i<position){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            i++;
        }
        System.out.println(n2);

    }
}