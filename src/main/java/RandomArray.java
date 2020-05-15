import java.util.Random;

public class RandomArray {
    public static int[] newRandomArray(int size, int maxIntSize){
        Random random = new Random();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = random.nextInt( maxIntSize);
        }
        return array;
    }
}
