import java.util.Scanner;
class Sample
{
    public static void main(String args[])throws Exception
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        if(m%2==0 && n%2==0)
        {
            System.out.println("YES");
        }
        else if(m%2==0 && n%2==1 && m!=0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}