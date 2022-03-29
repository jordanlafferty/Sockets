import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;

public class chatClient 
{
    public static void main(String[] args) throws Exception
    {
        Socket s = new Socket("locallhost", 2222);
        // won't get here until the line above blocks
        Scanner clientInput = new Scanner(s.getInputStream());
        String name = clientInput.nextLine();
        System.out.println("client read: " + name);
        Scanner localInput = new Scanner(System.in);
        PrintStream clientOutput = new PrintStream(s.getOutputStream());
        clientOutput.println(localInput.nextLine());

    }
}
