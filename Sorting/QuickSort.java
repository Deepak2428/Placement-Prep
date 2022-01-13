import java.util.*;
class QuickSort
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        quickSort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void quickSort(int a[],int lo,int hi)
    {
        if(lo>hi)
        {
            return;
        }
        int pivot=a[hi];
        int pi=partition(a,lo,hi,pivot);
        quickSort(a,lo,pi-1);
        quickSort(a,pi+1,hi);
    }
    
    public static int partition(int a[],int lo,int hi,int pivot)
    {
        int i=lo;
        int j=lo;
        while(i<=hi)
        {
            if(a[i]<=pivot)
            {
                swap(a,i,j);
                j++;
                i++;
            }
            else
            {
                i++;
            }
        }
        return j-1;
    }
    
    public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}