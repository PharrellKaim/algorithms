public class InsertionSortJava {
    private static void insertionSort(int[] array){
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int elementToSort = array[i];

            int j = i;
            while (j > 0 && elementToSort < array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j] = elementToSort;
        }
    }
    public static void main(String[] args){
        int[] array = {2,4,1,8};
        insertionSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
