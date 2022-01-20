import java.util.*;
class phrasePalindrone {
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        String s=scn.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>=97 && s.charAt(i)<=122))
            {
                ans+=s.charAt(i);
            }
            else if((s.charAt(i)>=65 && s.charAt(i)<=90))
            {
                char ch=(char)(s.charAt(i)+32);
                ans+=ch;
            }
        }
        System.out.println(ans);
        System.out.println(isPlaindrone(ans));
    }
    public static boolean isPlaindrone(String x)
    {
        for(int i=0,j=x.length()-1;i<j;i++,j--)
        {
            if(x.charAt(i)!=x.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}
