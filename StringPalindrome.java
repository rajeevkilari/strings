import java.util.Scanner;
public class StringPalindrome{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        String str1= s.nextLine();
        int n= str1.length();
        String str2="";
        int i=0;
        for(;i<=n/2;i++){
            if(str1.charAt(i)!=str1.charAt(n-i-1)){
                System.out.println("not a palindrome");
                break;
            }else{
                continue;
            }
        }
        if(i>n/2){
            System.out.println("is a palindrome");
        }
        
    }
}