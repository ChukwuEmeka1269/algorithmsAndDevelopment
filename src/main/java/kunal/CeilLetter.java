package kunal;

public class CeilLetter {
    public static void main(String[] args) {
        char[] array = {'c', 'f', 'j'};
        char character = 'j';
        System.out.println(ceilChar(array, character));
    }

    public static char ceilChar(char[] array, char character){
        int startIndex = 0;
        int endIndex = array.length -1;

//        if(character > array[array.length -1]){
//            return -1;
//        }

        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex)/2;

            if(character < array[mid]){
                endIndex = mid - 1;
            }else{
                startIndex = mid + 1;
            }
        }

        return array[startIndex % array.length];
    }
}
