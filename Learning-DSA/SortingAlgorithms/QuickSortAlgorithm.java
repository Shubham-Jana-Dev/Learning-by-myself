package SortingAlgorithms;
import java.util.ArrayList;
import java.util.List;

public class QuickSortAlgorithm{

    public static void main(String[] args){
        ArrayList<Integer> myArray = new ArrayList<>(List.of(23,12,33,45,43,67,89,11));
        System.out.println(myArray);
        System.out.println(myArray.get(1));
        myArray.set(2,myArray.get(6));
        System.out.println(myArray);

        int temp = myArray.get(myArray.size() - 1);
        myArray.set(myArray.size() - 1,myArray.get(0));
        myArray.set(0,temp);
        System.out.println(myArray.size());
        System.out.println(myArray);

    }
}