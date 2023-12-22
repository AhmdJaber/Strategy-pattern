package com.mycompany.arrayprocessor;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        ArrayProcessor arrayprocess = new ArrayProcessor(); 
        
        // The First Array
        arrayprocess.setSearch(new LinearSearch());
        arrayprocess.setSort(new BubbleSort());
        arrayprocess.setFilter(new Greater());
        
        System.out.println("Enter a new array");
                
        int n = scanner.nextInt(); 
        int[] arr1 = new int[n];
        
        for (int i = 0; i < n; i++) 
            arr1[i] = scanner.nextInt();
        
        int index = arrayprocess.getSearch().Search(arr1, 5); 
        System.out.println(index);
        
        arrayprocess.getSort().Sort(arr1);
        
        ArrayList<Integer> cur = arrayprocess.getFilter().Filter(arr1, 7); 
        
        for(Integer i: cur){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        // =====================================================================
        // The second Array
        arrayprocess.setSearch(new BinarySearch());
        arrayprocess.setSort(new MergeSort());
        arrayprocess.setFilter(new Less());

        System.out.println("Enter a new array");
        n = scanner.nextInt(); 
        int[] arr2 = new int[n];
        
        for (int i = 0; i < n; i++) 
            arr2[i] = scanner.nextInt();
        
        arrayprocess.getSort().Sort(arr2);
        
        index = arrayprocess.getSearch().Search(arr2, 10); 
        System.out.println(index);
        
        
        cur = arrayprocess.getFilter().Filter(arr2, 2); 
        
        for(Integer i: cur){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        // =====================================================================
        // The Third Array
        arrayprocess.setSearch(new BinarySearch());
        arrayprocess.setSort(new InsertionSort());
        arrayprocess.setFilter(new Greater());
        
        System.out.println("Enter a new array");
        n = scanner.nextInt(); 
        int[] arr3 = new int[n];
        
        for (int i = 0; i < n; i++) 
            arr3[i] = scanner.nextInt();
        
        arrayprocess.getSort().Sort(arr3);
        
        index = arrayprocess.getSearch().Search(arr3, 12); 
        System.out.println(index);
        
        cur = arrayprocess.getFilter().Filter(arr3, 5); 
        
        for(Integer i: cur){
            System.out.print(i + " ");
        }
        
        System.out.println("");
    }
}