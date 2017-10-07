package sofe.exercise1;

public class ContinuousArray {

    public static boolean isAlmostIncreasingSequence(int[] sequence) {
        boolean result = false;
        int contador = 0;

        for (int i = 1; i < sequence.length; i++){
            if (sequence[i] < sequence[i-1]){
                contador++;
            }
        }
        if (contador >= 2){
            return false;
        }else{
            return true;
        }
    }

}
