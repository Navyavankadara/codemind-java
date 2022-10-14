import java.io.*;
import java.util.Scanner;
class Sample
{
    public static void main(String args[])throws Exception
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            int p=a[j];
            int rem=0,rev=0,m=p;
            while(m!=0)
            {
                rem=m%10;
                rev=rev*10+rem;
                m=m/10;
            }
            if(rev==p)
            c++;
        }
        System.out.println(c);
    }
}