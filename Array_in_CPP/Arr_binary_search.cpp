//
// g++ -std=c++17 Arr_binary_search.cpp -o Arr_binary_search && ./Arr_binary_search
//
//
//  Created by Shubham Jana on 29/06/26.
//
#include <iostream>
#include <vector>

std::vector <int> create_array(){
    int Asize = 0;
    std::cout << "Enter the size of the array: ";
    std::cin >> Asize;
    std::vector <int> MyArray = { };
    for (int i = 0; i < Asize; i++){
        int element = 0;
        std::cout << "Enter the element: ";
        std::cin >> element;
        MyArray.push_back(element);
    }
    return MyArray;
}

void displayArray(const std::vector<int>& The_array){
    bool start = true;
    std::cout << "[";
    for (int j : The_array){
        if( start == false){
            std::cout << ", " << j;
        }else{
            std::cout << j ;
            start = false;
        }
    }
    std::cout << "]" << std::endl;
}

std::vector <int> SortArray(std::vector<int> sArray){
    int array_size = sArray.size();
    int temp = 0;
    for (int i = 0; i<array_size; i++){
        for(int j = i + 1; j<array_size; j++){
            if(sArray[j]<sArray[i]){
                temp = sArray[j];
                sArray[j] = sArray[i];
                sArray[i] = temp;
            }
        }
    }
    return sArray;
}

void binary_search(const std::vector<int> &array, int terget){
    int ArraySize = array.size();
    int low = 0;
    int high = ArraySize - 1;
    bool found = true;
    while (low<=high){
        int mid = low + (high-low)/2;
        if(array[mid] == terget){
            std::cout << terget << " is found at index "<< mid << std::endl;
            found = false;
            break;
        }else if(terget < array[mid]){
            high = mid - 1;
        }else{
            low = mid + 1;
        }
    }
    if(found){
        std::cout << "The element has not found int the array."<<std::endl;
    }
}

int main(){
    std::vector <int> the_array = {23,57,56,9,89,1,132,6};
    int terget = 154;
    
    std::vector <int> myArray = { };
    myArray = create_array();
    std::cout << "The provided array: ";
    displayArray(myArray);
    std::cout<<std::endl;
    
    std::cout << "After implementing sorting: ";
    displayArray(SortArray(myArray));
    std::cout<<std::endl;
    
    int myTerget = 0;
    std::cout << "Enter the tergeted element: ";
    std::cin >> myTerget;
    binary_search(SortArray(myArray),myTerget);
    
//    binary_search(the_array,terget);
//    displayArray(the_array);
//    displayArray(create_array());
    //SortArray(the_array);
    //displayArray(SortArray(the_array));
    
    return 0;
}
