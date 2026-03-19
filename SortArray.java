package JavaCoding;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int arr[] = {5, 2, 9, 1, 3};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}