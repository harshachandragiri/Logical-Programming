import java.util.Scanner;


public class inputarray{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=scan.nextInt();

        }
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");

        }
        
    }
}