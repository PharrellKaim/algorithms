package sortingAlgorithms.Java;
public class BubbleSort {
    private static void bubbleSort(int[] array){
        int length = array.length;
        int temp = 0;

        for (int i = 0; i < length; i++){
            for(int j = 1; j < (length-i); j++){
                if(array[j-1] > array[j]) {
                    //swap the elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] array = {2,4,1,8,6, 7 , 90, 70, 20, 50};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}