import java.util.*;
import java.lang.*;
import java.io.*;
class Sample
{
    public static void main(String[] args)throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int L=sc.nextInt();
            int R=sc.nextInt();
            int cnt=0;
            for(int i=L;i<=R;i++)
            {
                if((i%10)==2||(i%10)==3||(i%10)==9)
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}