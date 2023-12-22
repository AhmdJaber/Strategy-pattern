package com.mycompany.arrayprocessor;

public class BinarySearch implements Search{
    public int Search(int arr[], int tar){
        int l = 0, r = arr.length; 
        while(l <= r){
            int mid = (l + r) / 2; 
            if (arr[mid] == tar){
                return mid; 
            }
            
            else if (arr[mid] > tar){
                r = mid - 1; 
            }
            
            else {
                l = mid + 1; 
            }
        }
        
        return -1; 
    }
}
