import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        char s;
        Scanner sc=new Scanner(System.in);
        s=sc.next().charAt(0);
        switch(s)
        {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("Vowel");
                break;
                default:
                System.out.println("Consonant");
                
        }
    }
}