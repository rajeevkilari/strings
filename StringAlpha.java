import java.util.Scanner;
public class StringAlpha{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
       String str= s.nextLine();
        int n=str.length();
        int count=0;
        int i=0;
        while(i<n){
            if(str.charAt(i)!=' '){
                count=count+1;
            }else{
                System.out.println(count);
                count=0;
            }
           i=i+1; 
        }
        i=n-1;
        count=0;
        for(;i>0;i--){
            if(str.charAt(i)!=' '){
                count=count+1;
            }else{
                System.out.println(count);
                break;
            }
        }
        
    }
}