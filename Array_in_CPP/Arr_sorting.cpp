//
//  Arr_sroting.cpp
//  
//
//  Created by Shubham Jana on 27/06/26.
//

// g++ -std=c++17 Arr_sorting.cpp -o Arr_sorting && ./Arr_sorting

#include <iostream>
#include <vector>
std::vector<int> array_creation(){
    std::vector <int> MyArray = { };
    int ArraySize = 0;
    std::cout << "Enter the size of the array: ";
    std::cin >> ArraySize;
    for (int i = 0; i < ArraySize; i++){
        int element = 0;
        std::cout << "Enter the element: ";
        std::cin >> element;
        MyArray.push_back(element);
    }
    return MyArray;
}
std::vector<int> ArraySorting(std::vector<int> arr){
    int temp = 0;
    int ArrSize = arr.size();
    for ( int k = 0; k < ArrSize; k++){
        for (int l = k; l < ArrSize; l++){
            if(arr[k] < arr[l]){
                temp = arr[k];
                arr[k] = arr[l];
                arr[l] = temp;
            }
        }
    }
    return arr;
}
void DisplayArray(std::vector<int> My_array){
    std::cout << "[";
    for (int j : My_array){
        std::cout << j << " ";
    }
    std::cout << "]";
}
int main(){
//    ArraySorting(array_creation());
    DisplayArray(ArraySorting(array_creation()));
    return 0;
}
