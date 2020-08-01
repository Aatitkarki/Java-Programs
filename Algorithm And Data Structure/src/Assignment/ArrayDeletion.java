package Assignment;

public class ArrayDeletion {

    private static void printArray(int[] arr) {
        for (int a: arr)
            System.out.print(a + " ");
        System.out.println();
    }

    /*
        you need to delete 'num' from array 'arr', store '0' instead of 'num' and then do the shifting operation
        Example: arr = [1,2,3,4,5], num = 4
        Then, your array should be [1,2,3,5,0]
        CONSTRAINTS:
        'arr' contains unique elements
        'num' might not be in the array, in that case, print "error"
        'arr' might not be sorted
     */
    public static void delete(int[] arr, int num) {
        boolean found = false;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == num) {
                found = true;
                arr[i] = 0;
                shift(arr, i);
                break; // since the array contains all unique elements
            }
        }
        if (!found)
            System.out.println("Error!");
    }

    private static void shift(int[] arr, int index) {
        if (index == arr.length - 1) return;
        for (int i = index; i < arr.length -1; ++i) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,25,21,18,19};
        delete(arr, 5);
        printArray(arr);
        delete(arr, 10);
        printArray(arr);
        delete(arr, 1);
        printArray(arr);
        delete(arr, 20);
        printArray(arr);
    }
}
