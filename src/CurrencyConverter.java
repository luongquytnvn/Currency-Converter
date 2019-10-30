import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number monney (USD):");
        double usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.println("Monney (VND) = " + vnd);
    }
}
