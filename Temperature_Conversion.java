import java.io.*;
import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int c;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        float f;
        f=32+(c*(float)9/5);
        System.out.format("%.2f",f);
    }
}