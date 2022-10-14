import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int h,sn,sd;
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        sn=sc.nextInt();
        sd=sc.nextInt();
        if(h>50&&sn>60&&sd>100)
        {
            System.out.println("10");
        }
        else if(h>50&&sn>60)
        {
            System.out.println("9");
        }
        else if(sn>60&&sd>100)
        {
            System.out.println("8");
        }
        else if(h>50&&sd>100)
        {
            System.out.println("7");
        }
        else if(h>50||sn>60||sd>100)
        {
            System.out.println("6");
        }
        else
        {
            System.out.println("5");
        }
    }
}