package SortingAlgorithms;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class QuickSortAlgorithm{
    public static int partition(ArrayList<Integer> arr, int start, int end){
        int idx = start - 1;
        int pivot = arr.get(end);

        for(int j = start; j<end;j++){
            if(arr.get(j)<=pivot){
                idx++;
                Collections.swap(arr,j,idx);
            }
        }
        idx++;
        Collections.swap(arr, end, idx);
        return idx;
    }
    public static void QuickSort(ArrayList<Integer> arr, int start, int end){
        if(start<end){
            int pivot_index = partition(arr,start,end);
            QuickSort(arr,start,pivot_index-1);
            QuickSort(arr,pivot_index+1,end);
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> myArray = new ArrayList<>(List.of(23,12,33,45,43,67,89,11));
        System.out.println(myArray);
        //Collections.swap(myArray, 0, myArray.size()-1);
        System.out.println(myArray.size());

        QuickSort(myArray,0,myArray.size() - 1);
        System.out.println(myArray);

    }
}