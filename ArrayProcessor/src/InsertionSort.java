package com.mycompany.arrayprocessor;

public class InsertionSort implements Sort{
    
    @Override
    public void Sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int k = arr[i], j = i - 1;

            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }
    }
}
