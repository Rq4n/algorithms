package Recursion;

public class Fatorial {
    public static int fat(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * fat(x - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fat(5));
    }
}
