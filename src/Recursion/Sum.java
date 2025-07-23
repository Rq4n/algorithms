package Recursion;

public class Sum {
    public static int Sum(int num) {
        if (num > 0){
            return num + Sum(num - 1);
        } else{
            return num;
        }
    }

    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
}
