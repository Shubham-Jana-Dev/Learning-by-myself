//
//  Arr_linear_search.cpp
//  
//
//  Created by Shubham Jana on 27/06/26.

// g++ -std=c++17 Arr_linear_search.cpp -o Arr_linear_search && ./Arr_linear_search

#include <iostream>
#include <vector>
void create_array(){
    std::vector <int> My_array = { };
    int ArraySize = 0;
    std::cout << "Enter the size of the array: ";
    std::cin >> ArraySize;
    for (int i = 0; i < ArraySize; i++){
        int element = 0;
        std::cout << "Enter the element: ";
        std::cin >> element;
        My_array.push_back(element);
    }
    int found = -1;
    int terget = 0;
    std::cout << "Enter the terget: ";
    std::cin >> terget;
    for(int j = 0; j < ArraySize; j++){
        if(My_array[j] == terget){
            found = j;
            std::cout<< terget << " is found at index "<< j << std::endl;
        }
    }
    if(found == -1){
        std::cout << "Sorry it looks like " << terget << " is not in the array."<<std::endl;
    }
}
int main(){
    create_array();
    return 0;
}
