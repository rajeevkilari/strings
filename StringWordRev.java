import java.util.Scanner;
public class StringWordRev{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
      String str1= s.nextLine();
        int n= str1.length();
        String str2="";
        String space=" ";
        String str3="";
        for(int i=0;i<n;i++){
            if(str1.charAt(i)!=' '){
                str2=str2+str1.charAt(i);
            }else{
                str3=space+str2+str3;
                str2="";
            }
        }
        str3=str2+str3;
          System.out.println(str3);
    }
}