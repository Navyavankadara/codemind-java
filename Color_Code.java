import java.io.*;
class Sample
{
    public static void main(String args[])throws Exception
    {
        char c;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        c=(char)br.read();
        switch(c)
        {
            case'V':
            case'v':
                System.out.println("Violet");
                break;
                case'I':
                case'i':
                    System.out.println("Indigo");
                    break;
                case'B':
                case'b':
                    System.out.println("Blue");
                    break;
                case'Y':
                case'y':
                    System.out.println("Yellow");
                    break;
                case'O':
                case'o':
                    System.out.println("Orange");
                    break;
                case'R':
                case'r':
                    System.out.println("Red");
                    break;
                case'G':
                case'g':
                    System.out.println("Green");
                    break;
                default:
                System.out.println("-1");
                    
        }
    }
}