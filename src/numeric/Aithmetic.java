package numeric;

public class Aithmetic {
    public static void main(String[] args) {
            double small = 0.7;
            double big = 0.9;

            double bigger = small + 0.1;
            double smaller = big - 0.1;

            System.out.println(big == small + 0.2);
            System.out.println(bigger == small + 0.1);
            System.out.println(bigger == smaller);
            System.out.println(0.3 + 0.6);
            System.out.println(0.3 + 0.6 == 0.9);
    }
}
