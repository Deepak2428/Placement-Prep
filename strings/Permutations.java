import java.util.*;
class Permutations {
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        String s=scn.next();

        printAllPermutations(s,"");
    }
    public static void printAllPermutations(String s,String ssf) {

        if(s.length()==0)
        {
            System.out.println(ssf);
        }
        for(int i=0;i<s.length();i++)
        {
           
            String rems=s.substring(0,i)+s.substring(i+1);
            printAllPermutations(rems,ssf+s.charAt(i));
        }

        
    }

}
