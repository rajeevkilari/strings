import java.util.Scanner;
public class StringSmallWord{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        String str=s.nextLine();
        String str2="";
        String res="";
        int n=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                str2=str2+str.charAt(i);
            }else{
                n= str2.length();
                if(n<min){
                    min=n;
                    res=str2;
                }
                str2="";
            }
        }
          n= str2.length();
                if(n<min){
                    min=n;
                    res=str2;
                }
                System.out.println(res);
    }
}