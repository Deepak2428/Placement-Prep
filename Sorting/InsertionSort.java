import java.util.*;
class InsertionSort
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        int key=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]<key)
            {
                key=a[i];
                for(int j=i-1;j>=0&&a[j]>key;j--)
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
            key=a[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}