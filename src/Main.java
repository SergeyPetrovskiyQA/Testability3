public class Main {
    public static void main(String[] args) {
        СreditPayment service = new СreditPayment();

        System.out.println(service.calculate(9.99, 1_000_000, 1));

        System.out.println(service.calculate(9.99, 1_000_000, 2));

        System.out.println(service.calculate(9.99, 1_000_000, 3));

    }
}
