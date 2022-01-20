import java.util.*;
class MaxFrequency
{
    public static void main(String args[])
    {
        char ch=' ';
        Scanner scn= new Scanner(System.in);
        String s=scn.next();
        int count[]= new int[256];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<256;i++)
        {
            if(count[i]>max)
            {
                ch=(char)max;
                max=count[i];
            }
        }
        System.out.println(ch+"->"+max);
    }
}