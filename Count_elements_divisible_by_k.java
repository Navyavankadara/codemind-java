import java.io.*;
import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,k,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a;
            a=sc.nextInt();
            if(a%k==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}