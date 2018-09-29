import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double value;
        Convert convert = new Convert();
        System.out.println("Convert from :  USD, UAH, EUR, RUB");
        String swtch = in.next();
        swtch = swtch.toUpperCase();

        System.out.println("Введите значение : ");
        value = in.nextDouble();
        System.out.println(convert.toUSD(value, swtch));

    }
}
