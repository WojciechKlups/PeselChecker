package pl.sda;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App extends PeselCheckingThings
{
    public static void main( String[] args )
    {
        App app = new App();
        Scanner scan = new Scanner(System.in);
        String userPesel = scan.nextLine();
        app.checkPesel(userPesel);
    }
}
