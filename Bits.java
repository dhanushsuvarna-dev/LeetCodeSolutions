public class Bits {
    public static void main(String[] args) {
        int n = 5;// 0101
        int pos = 2;
        int bitMask = 1 << pos;
        int n1 = ~(bitMask) & n;
        System.out.println(n >> 2);
        System.out.println(n1);
    }
}
