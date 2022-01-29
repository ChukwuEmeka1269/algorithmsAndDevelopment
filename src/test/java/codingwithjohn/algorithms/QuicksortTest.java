package codingwithjohn.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class QuicksortTest {

    private Random random ;
    private int[] array;
    private int bound;


    @Test
    @BeforeEach
    void init(){
        random = new Random();
        array = new int[bound];
        for(int i=0; i< array.length; i++){
            array[i] = random.nextInt(100);
        }
    }



    @Test
    @DisplayName("Quick Sort")
    void shouldDoAQuickSort() {
        //Given
        bound = 10;
        //When
        Quicksort.quickSort(array);
        //Then

    }

    @Test
    void swap() {
    }

    @Test
    void printArray() {
    }
}