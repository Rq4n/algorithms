package Recursion;

public class teste1 {
    public static void main(String[] args) {
        regressiva(15);
    }

    public static void regressiva(int i) {
        if (i <= 0) {
            return;
        }
        System.out.println(i);
        regressiva(i - 1);
    }
}