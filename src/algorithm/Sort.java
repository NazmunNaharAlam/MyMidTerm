package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implfement here

        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        int temp;
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < (list.length - i); j++) {
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public void mergeSort(int[] array, int l, int m, int r) {
        int[] list = array;
        //implement here
        final long startTime = System.currentTimeMillis();
        int n1 = m - 1 + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = array[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = array[m + 1 + j];
        int i = 0, j = 0;
        int k = 1;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;

        }
    }

    public int [] quickSort(int [] array, int low, int high) {
        int[] list = array;
        final long startTime = System.currentTimeMillis();
        //implement here
        int pivot = list[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list[j] <= pivot) {
                i++;
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        int temp = array[i + 1];
        list[i + 1] = array[high];
        list[high] = temp;
        return list;
    }
//////////////////////////////////////////////////////////////////////////
    public int [] heapSort(int [] array) {
        int[] list = array;
        int n = array.length;
        //implement here
        buildheap(list);
        int sizeOfHeap=list.length-1;
        for(int i=sizeOfHeap; i>0; i--) {
            exchange(list,0, i);
            sizeOfHeap=sizeOfHeap-1;
            heapify(list, 0,sizeOfHeap);
        }
        return list;

    }
    public static void buildheap(int []arr) {
        for(int i=(arr.length-1)/2; i>=0; i--){
            heapify(arr,i,arr.length-1);
        }
    }

    public static void heapify(int[] arr, int i,int size) {
        int left = 2*i+1;
        int right = 2*i+2;
        int max;
        if(left <= size && arr[left] > arr[i]){
            max=left;
        } else {
            max=i;
        }

        if(right <= size && arr[right] > arr[max]) {
            max=right;
        }
        if(max!=i) {
            exchange(arr,i, max);
            heapify(arr, max,size);
        }
    }

    public static void exchange(int[] arr,int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////


    public int[] bucketSort(int[] array, int maxVal) {
        int[] list = array;
        //implement here
        int minValue = list[0];
        int maxValue = list[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        int inner, outer;
        int temp;

        int h = 1;
        while (h <= list.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < list.length; outer++) {
                temp = list[outer];
                inner = outer;

                while (inner > h - 1 && list[inner - h] >= temp) {
                    list[inner] = list[inner - h];
                    inner -= h;
                }
                list[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
