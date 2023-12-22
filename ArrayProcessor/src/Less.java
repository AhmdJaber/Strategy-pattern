package com.mycompany.arrayprocessor;

import java.util.ArrayList;

public class Less implements Filter{
    
    @Override
    public ArrayList<Integer> Filter(int[] arr, int tar) {
        ArrayList<Integer> ans = new ArrayList<>(); 
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < tar){
                ans.add(arr[i]); 
            }
        }
        
        return ans;
    } 
}
