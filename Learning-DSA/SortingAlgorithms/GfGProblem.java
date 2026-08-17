package SortingAlgorithms;
import java.util.*;

public class GfGProblem {
    public static int partition(ArrayList<Integer> arr, int start, int end){
        int idx = start-1;
        int pivot = arr.get(end);
        for(int j = start; j < end; j++){
            if(arr.get(j)<=pivot){
                idx++;
                Collections.swap(arr, j, idx);
            }
        }
        idx++;
        Collections.swap(arr,end,idx);
        return idx;
    }

    public static void QuickSort(ArrayList<Integer> arr, int start, int end){
        if(start<end){
            int pivot_index = partition(arr, start, end);
            QuickSort(arr,start,pivot_index -1);
            QuickSort(arr,pivot_index+1,end);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>(List.of(3, 4, 2, 2, 4));
        ArrayList<Integer> nums2 = new ArrayList<>(List.of(3, 2, 2, 7));
        ArrayList<Integer> nums3 = new ArrayList<>();
        for(Integer j : nums2){
            if(nums1.contains(j)){
                nums1.remove(j);
                nums3.add(j);
            }
        }
        System.out.println(nums3);
        QuickSort(nums3,0,nums3.size()-1);
        System.out.println(nums3);
    }
}