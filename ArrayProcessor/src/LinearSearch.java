package com.mycompany.arrayprocessor;

public class LinearSearch implements Search {
    @Override
    public int Search(int[] arr, int tar){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == tar){
                return i; 
            }
        }
        return -1; 
    }
}
