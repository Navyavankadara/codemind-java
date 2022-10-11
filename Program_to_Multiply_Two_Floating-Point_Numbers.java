import java.util.Scanner;
class Sample
{
    public static void main(String args[])throws Exception
    {
        float m,n,mul;
        Scanner sc=new Scanner(System.in);
        m=sc.nextFloat();
        n=sc.nextFloat();
        mul=m*n;
        System.out.format("%.2f",mul);
    }
}