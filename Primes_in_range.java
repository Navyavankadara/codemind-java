import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int m,n,c=0;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            int count=0;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    count=1;
                    break;
                }
            }
            if(count==0&&i!=0&&i!=1)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}