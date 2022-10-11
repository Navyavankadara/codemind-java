import java.io.*;
import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int t,s,b,disc;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        disc=2*t*s*b*512;
        System.out.println(disc);
        
    }
}