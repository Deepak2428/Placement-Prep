import java.util.*;
class Series4
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]= new int[n];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        int sum=1+2+3;
        boolean flag=true;
        for(int i=3;i<n;i++)
        {
            if(flag)
            {
                arr[i]=arr[i-3]+arr[i-2]+arr[i-1];
                sum+=arr[i];
                flag=!flag;
            }
            else
            {
                arr[i]=arr[i-2]+arr[i-1];
                sum+=arr[i];
                flag=!flag;
            }
        }
        System.out.println(sum);
    }
}