import java.util.*;
class toh
{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=scn.nextInt();
       
        toh(n,1,2,3);
        
    }
    public static void toh(int n,int t1,int t2,int t3)
    {
        if(n==0)
        {
            return ;
        }
        toh(n-1,t1,t3,t2);
        System.out.println("Move disc"+n+" from "+t1+" to "+t2);
        toh(n-1,t3,t2,t1);
        
        return;
    }
    
    
}