import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        float m,n,avg;
        Scanner sc=new Scanner(System.in);
        m=sc.nextFloat();
        n=sc.nextFloat();
        avg=(float)((m+n)/2);
        System.out.format("%.4f",avg);
    }
}