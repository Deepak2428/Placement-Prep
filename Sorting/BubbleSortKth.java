import java.util.*;
class BubbleSortKth
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
        int k=scn.nextInt();
        for(int i=0;i<k-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    swap(a,j,j+1);
                }
            }
        }
        System.out.println("Sorted : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}