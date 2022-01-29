package kindsonTheTechPro;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int [] sortThis = {6, 3, 9, 5, 4, 8, 2, 1, 7};
        bubbleSort(sortThis);
        for(int item: sortThis){
            System.out.print(item + " ");
        }
    }

    public static void bubbleSort(int[] A){
        int temp;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length - 1; j++){
                if(A[j] > A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }
}
