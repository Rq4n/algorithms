
public class BinarySearch {
    public static Integer binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (list[mid] == key){
                return mid;
            } else if (list[mid] < key) {
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] myList = {1,3,7,10,20};
        System.out.println(binarySearch(myList, 3));
    }
}



