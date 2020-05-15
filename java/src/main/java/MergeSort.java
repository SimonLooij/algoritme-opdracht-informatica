public class MergeSort {

    public static void mergeSort(int[] array){
        long startTime = System.currentTimeMillis();
        sort(array, 0, array.length - 1);
        long endTime = System.currentTimeMillis();
        System.out.println("Sorting took: " + (endTime - startTime) + " milliseconds with " + array.length + " numbers");
    }

    private static void sort(int[] array, int left, int right){
        if(left < right) {
            int middle = left + (right - left) / 2;

            sort(array, left, middle);
            sort(array, middle + 1, right);

            merge(array, left, right, middle);
        }
    }


    private static void merge(int[] array, int left, int right, int middle){
        int tempLSize = middle - left + 1;
        int tempRSize = right - middle;

        int[] tempL = new int[tempLSize];
        int[] tempR = new int[tempRSize];
        
        System.arraycopy(array, left, tempL, 0, tempLSize);
        System.arraycopy(array, middle + 1, tempR, 0, tempRSize);

        int indexL = 0;
        int indexR = 0;
        int indexMerged = left;

        while (indexL < tempLSize && indexR < tempRSize) {
            if (tempL[indexL] <= tempR[indexR]) {
                array[indexMerged] = tempL[indexL];
                indexL++;
            }
            else {
                array[indexMerged] = tempR[indexR];
                indexR++;
            }
            indexMerged++;
        }
        while (indexL < tempLSize) {
            array[indexMerged] = tempL[indexL];
            indexL++;
            indexMerged++;
        }
        while (indexR < tempRSize) {
            array[indexMerged] = tempR[indexR];
            indexR++;
            indexMerged++;
        }
    }
}
