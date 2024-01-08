import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = myScanner.nextInt();
        if (year % 4 == 0) {
            System.out.println(+year + " is a Leap Year");
        } else {
            System.out.println(+year + "Not a Leap Year ");
        }

    }
}
