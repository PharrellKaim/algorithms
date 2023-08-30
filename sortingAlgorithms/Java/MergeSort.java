package sortingAlgorithms.Java;
public class MergeSort {
    private static void mergeSort(int[] array, int arrayLength){
       if (arrayLength < 2){
           return;
       }
       int middle = arrayLength / 2;
       int[] leftArray = new int[middle];
       int[] rightArray = new int[arrayLength-middle];
       for (int i = 0; i < middle; i++){
           leftArray[i] = array[i];
       }
       for (int i = middle; i < arrayLength; i++){
           rightArray[i-middle] = array[i];
       }
       mergeSort(leftArray, middle);
       mergeSort(rightArray, arrayLength - middle);

       merge(array,leftArray,rightArray,middle,arrayLength-middle);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right){
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if(leftArray[i] <= rightArray[j]){
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left){
            array[k++] = leftArray[i++];
        }
        while (j < right){
            array[k++] = rightArray[j++];
        }
    }
    public static void main(String[] args){
        int[] array = {2,4,1,8,12,3,1,22};
        mergeSort(array, array.length);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}