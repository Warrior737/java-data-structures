package data.structures.sorts.quick;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;

        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    public static void main(String[] args) {
        int[] myArray = {4,6,1,7,3,2,5};

        int returnedIndex = pivot(myArray, 0, 6);

        System.out.println("Returned Index: " + returnedIndex);
        System.out.println(Arrays.toString( myArray ));

        int[] myArray2 = {4,6,1,7,3,2,5};
        quickSort(myArray2);
        System.out.println( Arrays.toString(myArray2));

    }

    public static void quickSortHelper(int[] array, int left, int right){
        if(left < right) {
            int pivotIndex = pivot(array, left , right );
            quickSortHelper(array, left , pivotIndex - 1);
            quickSortHelper(array, pivotIndex+1, right);
        }
    }
    public static void quickSort(int[] array){
        quickSortHelper(array, 0, array.length-1);
    }






}
