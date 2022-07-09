public class Bubble extends MainClass{

    public int[] bubbleSort(int[] array){
        
        int arrayLength = array.length;
        
        for(int i = 0; i < arrayLength; i++){
            for(int j = 0; j < arrayLength-i-1; j++){

                if(array[j] > array[j+1]){
                    int temporalNumber = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporalNumber; 
                    
                }
            }
        }

        return array;
    }

    public static void main(String args[]){
        Bubble bubble = new Bubble();
        int[] array = {-23, 1, -8, 2, 4, 3, 6, -90, 37, 299}; 
        System.out.println(bubble.toString(bubble.bubbleSort(array)));
    }
}