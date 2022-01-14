import java.util.*;
class Series4
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int a=1;
        int b=2;
        int c=3;
        int sum=0;
        boolean flag=true;
        for(int i=3;i<=n;i++)
        {
            if(flag)
            {
                sum+=a+b+c;
            }
            else
            {
                a=b;
                b=c;
                c=b+c;
                sum+=b+c;
            }
        }
        System.out.println(sum);
    }
}