import java.util.Scanner;
public class StringAscii{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
      String str= s.nextLine();
        int n= str.length();
        int countD=0;
        int countA=0;
        int countSp=0;
        for(int i=0;i<n;i++){
            if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122)){
                countA=countA+1;
            }else if(str.charAt(i)>=48 && str.charAt(i)<=57){
                countD=countD+1;
            }else{
                countSp=countSp+1;
            }
        }
        System.out.println("special characters :" + countSp);
        System.out.println("digits :" + countD);
        System.out.println("alphabets :" + countA);
    }
}