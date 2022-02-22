import java.util.Scanner;
public class StringVowCon{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
      String str1= s.nextLine();
        int n= str1.length();
        int countV=0;
        int countC=0;
        int word=0;
        for(int i=0;i<n;i++){
            if(str1.charAt(i)!=' '){
            if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u'){
            countV=countV+1;
             }else{
                 countC=countC+1;
             }
            }else{
                word=word+1;
                System.out.print("word" + word + ":" + countV+"vowels" + countC+"comsonants" + " ");
                countV=0;
                countC=0;
            }
        }
        word=word+1;
                System.out.print("word" + word + ":" + countV+"vowels" + countC+"comsonants");
    }
}