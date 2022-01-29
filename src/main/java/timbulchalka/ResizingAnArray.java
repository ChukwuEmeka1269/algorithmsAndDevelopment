package timbulchalka;

import java.util.Arrays;
import java.util.Scanner;

public class ResizingAnArray {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseArray = new int[10];
    public static void main(String[] args) {
        readInput();
        print(baseArray);
        resize();
        baseArray[10] = 10;
        baseArray[11] = 23;
        baseArray[12] = 12;
        baseArray[13] = 15;
        baseArray[14] = 100;
        baseArray[15] = 109;
        baseArray[16] = 104;
        System.out.println("BaseArray after resize"+Arrays.toString(baseArray));


    }

    public static void readInput(){
        System.out.println("Please Enter a number: ");
        for(int i=0; i< baseArray.length; i++){
            baseArray[i] = scanner.nextInt();
        }
    }

    public static void print(int[] array){
        for (int j : array) {
            System.out.println(j + " ");
        }
    }

    public static void resize(){
        int[] newArray = baseArray;
        baseArray = new int[newArray.length * 2];
        for(int i=0; i< newArray.length; i++){
            baseArray[i] = newArray[i] ;
        }

    }
}
