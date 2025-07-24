package Recursion;

public class Sum2 {
    public static int Sum(int[] arr, int index){
        if(index == arr.length){
            return 0;
        } else {
            return arr[index] + Sum(arr, index + 1 );
            /* return 1 + Sum(arr, index + 1 );
            will return array length
             */
        }
    }

    public static void main(String[] args) {
        int [] myArr = {1,2,3};
        int sum = Sum(myArr, 0);
        System.out.println(sum);
    }
}
