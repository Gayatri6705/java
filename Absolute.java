import java.util.Scanner;
public class Absolute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double absoluteValue = Math.abs(number);
        System.out.println("The absolute value of " + number + " is " + absoluteValue);
        scanner.close();
    }
}