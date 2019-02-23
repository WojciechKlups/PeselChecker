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
        System.out.println("Please enter your PESEL: ");
        String userPesel = scan.nextLine();
        app.checkPesel(userPesel);
    }
}
