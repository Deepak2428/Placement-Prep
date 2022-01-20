import java.util.*;
public class ReverseWord {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        String arr[]= s.split(" ");
        String s1="";
        for(int i=arr.length-1;i>=0;i--)
        {
            s1+=arr[i]+" ";
        }
        System.out.println(s1);

    }

}
