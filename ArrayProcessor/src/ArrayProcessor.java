package com.mycompany.arrayprocessor;

public class ArrayProcessor {
    private  Search searching;
    private  Filter filtering;
    private Sort sorting;
    public static void main(String[] args){
        Main.execute();
    }
    public void printArr(int[] arr){
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public void setSearch(Search search){
        this.searching = search; 
    }

    public void setSort(Sort sort) {
        this.sorting = sort; 
    }

    public void setFilter(Filter filter) {
        this.filtering = filter; 
    }
    
    public Search getSearch(){
        return searching; 
    }

    public Sort getSort() {
        return sorting;  
    }

    public Filter getFilter() {
        return filtering;
    }

    
    
}
