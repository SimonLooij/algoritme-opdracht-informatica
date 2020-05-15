import random
import time


def mergeSort(array):
    if len(array) > 1:
        mid = len(array) // 2
        L = array[:mid]
        R = array[mid:]

        mergeSort(L)
        mergeSort(R)

        i = j = k = 0

        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                array[k] = L[i]
                i += 1
            else:
                array[k] = R[j]
                j += 1
            k += 1

        while i < len(L):
            array[k] = L[i]
            i += 1
            k += 1

        while j < len(R):
            array[k] = R[j]
            j += 1
            k += 1


if __name__ == '__main__':
    arr = [random.randint(0, 101) for i in range(100000)]
    start_time = time.time_ns() // 1000000
    mergeSort(arr)
    end_time = time.time_ns() // 1000000
    print("Sorting took: " + str(end_time - start_time) + " milliseconds with " + str(len(arr)) + " numbers")
