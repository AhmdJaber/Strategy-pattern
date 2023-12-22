package com.mycompany.arrayprocessor;

public class MergeSort implements Sort{ 
    
    @Override 
    public void Sort(int[] arr) {
        mergeSort(arr ,  0 , arr.length -1 );
    }
    
    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1, n2 = r - mid;

        int[] lArr = new int[n1], rArr = new int[n2];

        for (int i = 0; i < n1; ++i)
            lArr[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            rArr[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0, k = l;
        
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

}
