package data.structures.sorts.merge;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] array1, int[] array2) {
        int[] combine = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combine[index] = array1[i];
                index++;
                i++;
            } else {
                combine[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combine[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combine[index] = array2[j];
            index++;
            j++;
        }
        return combine;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 7, 8};
        int[] array2 = {2, 4, 5, 6};

        System.out.println(Arrays.toString(merge(array1, array2)));

        System.out.println("***** NEXT Merge Sort ********");

        int[] originalArray = {3,1,4,2};

        int[] sortedArray = mergeSort(originalArray);

        System.out.println("Original Array:" + Arrays.toString(originalArray )  );
        System.out.println("Sorted Array:" + Arrays.toString( sortedArray) );



    }




    public static int[] mergeSort(int[] array) {
        if(array.length ==1 ) return array;

        int midIndex = array.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] rigth = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, rigth);


    }

}
