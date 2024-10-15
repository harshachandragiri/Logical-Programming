public class palindromeArray{
    public static void main(String[] args){
        int[] arr= {1,2,3,2,1};
        boolean flag=true;
        int l=0;
        int h=arr.length-1;
        while(l<h){
            if(arr[l]!=arr[h]){
                flag=false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Palindraome");
        }else{
            System.out.println("Not a Palindraome");

        }
    }
}