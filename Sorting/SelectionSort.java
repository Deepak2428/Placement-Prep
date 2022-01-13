import java.util.*;
class SelectionSort
{
    public static void swap(int a[],int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]= temp;
    }
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            swap(a,min,i);
        }
        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}