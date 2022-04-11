package kunal;

public class BubbleSort {
    public static void main(String[] args) {
        int [] sortThis = {6, 3, 9, 5, 4, 8, 2, 1, 7};
        bubbleSort(sortThis);
        for(int item: sortThis){
            System.out.print(item + " ");
        }
    }

    public static void bubbleSort(int[] array){
        boolean swapped;
        for(int i=0; i< array.length; i++){
            swapped = false;
            for(int j= 1; j< array.length - i; j++){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }

        }
    }
}
