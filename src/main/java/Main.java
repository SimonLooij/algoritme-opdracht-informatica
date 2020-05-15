public class Main {
    public static void main(String[] args){
        int[] array = RandomArray.newRandomArray(100000, 100);
        MergeSort.mergeSort(array);
    }
}
