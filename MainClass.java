public class MainClass {
    
    public String toString(int[] array){
        String output = "";
        for(int i = 0; i < array.length; i++){
            output += "["+ array[i] +"] ";
        }
        return output;
    }

}
