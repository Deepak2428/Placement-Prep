import java.util.*;
class MergeSort
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
        a=mergeSort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    public static int [] mergeSort(int arr[],int lo,int hi)
    {
        if(lo==hi)
        {
            int ans[]= new int[1];
            ans[0]=arr[lo];
            return ans;
        }
        int mid=(lo+hi)/2;
        int a[]=mergeSort(arr,lo,mid);
        int b[]=mergeSort(arr,mid+1,hi);
        
        return mergeTwoSortedArray(a,b);
    }
    public static int [] mergeTwoSortedArray(int a[],int b[])
    {
        int ans[]=new int[a.length+b.length];
        int i;
        int j;
        int k=0;
        for(i=0,j=0;i<a.length&&j<b.length;)
        {
            if(a[i]<=b[j])
            {
                ans[k]=a[i];
                k++;
                i++;
            }
            else
            {
                ans[k]=b[j];
                k++;
                j++;
            }
        }
        if(i==a.length)
        {
            for(;j<b.length;j++)
            {
                ans[k]=b[j];
                k++;
            }
        }
        else if(j==b.length)
        {
            for(;i<a.length;i++)
            {
                ans[k]=a[i];
                k++;
            }
        }
        
        return ans;
    }
}
            
            
            
            
            
            