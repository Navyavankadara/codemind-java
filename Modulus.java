import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int m,n,mod;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        mod=m%n;
        System.out.println(mod);
    }
}