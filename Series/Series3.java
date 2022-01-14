import java.util.*;
class Series3
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        int sums=0;
        for(int i=1;i<=n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            sums+=a;
        }
        System.out.println(sums);
    }
}