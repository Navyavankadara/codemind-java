import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int m;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        if(m>0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}