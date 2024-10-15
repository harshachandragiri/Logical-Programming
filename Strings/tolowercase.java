public class tolowercase{
    public static void main(String[] args){
        String str="My name is HARSHAvardhan";
        String newStr=str.toLowerCase();
        System.out.println(newStr);
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count+=1;

            }
        }
        System.out.println("NO OF VOWELS ARE:"+count);
    }
}