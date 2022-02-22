import java.util.Scanner;
public class StringWords{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        String str= s.nextLine();
        int n=str.length();
        int count=1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' '){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
        