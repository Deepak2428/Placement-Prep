import java.util.*;
class Reverse {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String s=scn.next();

        System.out.println(reverse(s));

    }

    public static String reverse(String s)
    {
        String ans="";
        for(int i=s.length()-1;i>=0;i--)
        {
            ans+=""+s.charAt(i);
        }

        return ans;
    }
}
