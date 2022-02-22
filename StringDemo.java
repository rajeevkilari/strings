import java.util.StringTokenizer;
public class StringDemo{
    public static void main(String[] args){
        String str1="    data";
        String str2="base";
        StringBuffer str3=new StringBuffer();
        StringBuffer str4=new StringBuffer("ayesha");
        str1=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.trim());
        System.out.println(str3.capacity());
        System.out.println(str4.capacity());
        System.out.println(str4.reverse());
          // String str5="I am genius";
        StringTokenizer t = new StringTokenizer("i am a genius");
        System.out.println(t.countTokens());
            while(t.hasMoreTokens()){
               System.out.println(t.nextToken());
           }
           
    }
}