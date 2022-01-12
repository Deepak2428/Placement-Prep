import java.util.*;
class evenno
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        even(n,2);
    }
    public static void even(int n,int k)
    {
        if(n==0)
        {
            return;
        }
        if(k%2==0)
        {
            System.out.print(k+" ");
            even(n-1,k+2);
        }
    }
}