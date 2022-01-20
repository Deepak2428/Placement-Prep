import java.util.*;

import javax.swing.event.CellEditorListener;
class RemoveDuplicate
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        String s=scn.next();
        int count[]= new int[256];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        String ans="";
        for(int i=0;i<256;i++)
        {
           if(count[i]>2)
           {
               count[i]=2;
           }
        }

        for(int i=0;i<s.length();i++)
        {
            if(count[s.charAt(i)]>0)
            {
                ans+=""+s.charAt(i);
                count[s.charAt(i)]--;
            }
        }
        System.out.println(ans);
    }
}