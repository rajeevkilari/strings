import java.util.Scanner;
public class StringReverse{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        String str1= s.nextLine();
        int n= str1.length();
        String str2="";
        for(int i=0;i<n;i++){
            str2=str1.charAt(i)+str2;
        }
        System.out.print(str2);
    }
}
        