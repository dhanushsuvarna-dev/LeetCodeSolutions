public class Fact1 {
    static int fact(int n) {
        if (n == 1 | n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(2));
        System.out.println(fact(3));
        System.out.println(fact(4));
        System.out.println(fact(5));
        System.out.println(fact(6));
        System.out.println(fact(7));

    }
}
