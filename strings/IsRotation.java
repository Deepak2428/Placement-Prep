import java.util.*;
 class IsRotation {
    
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        String s1=scn.next();
        String s2=scn.next();

         s1=s1+s1;

        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(0))
            {
                String ans="";
                for(int j=i;j<i+s2.length();j++)
                {
                    ans+=s1.charAt(j);
                }
                if(s2.equals(ans))
                {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }

}
