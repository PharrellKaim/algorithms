public class BubbleSortJava {
    static void bubbleSort(int[] array){
        int length = array.length;
        int temp = 0;

        for (int i = 0; i < length; i++){
            for(int j = 1; j < (length-i); j++){
                if(array[j-1] > array[j]) {
                    //swap the elements
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] array = {2,4,1,8};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}