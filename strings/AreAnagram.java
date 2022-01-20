import java.util.*;
class AreAnagram
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        String s1=scn.next();
        String s2=scn.next();
        if(s1.length()!=s2.length())
        {
            System.out.println(false);
            return;
        }
        int count[]= new int[256];
        for(int i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}