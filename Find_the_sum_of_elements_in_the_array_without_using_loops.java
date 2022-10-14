import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        if(n<=30)
        {
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                sum=sum+arr[i];
            }
            System.out.println(sum);
        }
        else
        {
            System.out.println("Enter a Valid Number");
        }
    }
}