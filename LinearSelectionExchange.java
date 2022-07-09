public class LinearSelectionExchange extends MainClass{

    public int[] linearSelectionExchange(int[] array){

        for(int i = 0; i < array.length - 1; i++){
            for(int j = i+1; j < array.length; j++){
                
                if(array[i] > array[j]){
                    int auxiliarNumber = array[i];
                    array[i] = array[j];
                    array[j] = auxiliarNumber;
                }
            }
        }

        return array;
    }

    public static void main(String args[]){
        LinearSelectionExchange linear = new LinearSelectionExchange();
        int[] array = {6, 2, 1, 5, 4, 7};
        System.out.println(linear.toString(linear.linearSelectionExchange(array)));
    }
}