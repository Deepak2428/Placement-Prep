import java.util.*;
class Series1
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        
        float sum=0;
        float j=1;
        for(int i=1;i<=n;i++)
        {
            sum+=1/(j*j);
            j+=1.0;
        }
        System.out.println(sum);
    }
}